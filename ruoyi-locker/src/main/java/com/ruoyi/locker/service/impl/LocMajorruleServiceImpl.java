package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocMajorruleMapper;
import com.ruoyi.locker.domain.LocMajorrule;
import com.ruoyi.locker.service.ILocMajorruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 专业规则信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Service
public class LocMajorruleServiceImpl implements ILocMajorruleService 
{
    @Autowired
    private LocMajorruleMapper locMajorruleMapper;

    /**
     * 查询专业规则信息
     * 
     * @param majorruleId 专业规则信息ID
     * @return 专业规则信息
     */
    @Override
    public LocMajorrule selectLocMajorruleById(Long majorruleId)
    {
        return locMajorruleMapper.selectLocMajorruleById(majorruleId);
    }

    /**
     * 查询专业规则信息列表
     * 
     * @param locMajorrule 专业规则信息
     * @return 专业规则信息
     */
    @Override
    public List<LocMajorrule> selectLocMajorruleList(LocMajorrule locMajorrule)
    {
        return locMajorruleMapper.selectLocMajorruleList(locMajorrule);
    }

    /**
     * 新增专业规则信息
     * 
     * @param locMajorrule 专业规则信息
     * @return 结果
     */
    @Override
    public int insertLocMajorrule(LocMajorrule locMajorrule)
    {
        return locMajorruleMapper.insertLocMajorrule(locMajorrule);
    }

    /**
     * 修改专业规则信息
     * 
     * @param locMajorrule 专业规则信息
     * @return 结果
     */
    @Override
    public int updateLocMajorrule(LocMajorrule locMajorrule)
    {
        return locMajorruleMapper.updateLocMajorrule(locMajorrule);
    }

    /**
     * 删除专业规则信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocMajorruleByIds(String ids)
    {
        return locMajorruleMapper.deleteLocMajorruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除专业规则信息信息
     * 
     * @param majorruleId 专业规则信息ID
     * @return 结果
     */
    @Override
    public int deleteLocMajorruleById(Long majorruleId)
    {
        return locMajorruleMapper.deleteLocMajorruleById(majorruleId);
    }
}
