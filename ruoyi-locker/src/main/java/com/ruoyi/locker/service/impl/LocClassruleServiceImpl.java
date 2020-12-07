package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocClassruleMapper;
import com.ruoyi.locker.domain.LocClassrule;
import com.ruoyi.locker.service.ILocClassruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 班级规则信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Service
public class LocClassruleServiceImpl implements ILocClassruleService 
{
    @Autowired
    private LocClassruleMapper locClassruleMapper;

    /**
     * 查询班级规则信息
     * 
     * @param classruleId 班级规则信息ID
     * @return 班级规则信息
     */
    @Override
    public LocClassrule selectLocClassruleById(Long classruleId)
    {
        return locClassruleMapper.selectLocClassruleById(classruleId);
    }

    /**
     * 查询班级规则信息列表
     * 
     * @param locClassrule 班级规则信息
     * @return 班级规则信息
     */
    @Override
    public List<LocClassrule> selectLocClassruleList(LocClassrule locClassrule)
    {
        return locClassruleMapper.selectLocClassruleList(locClassrule);
    }

    /**
     * 新增班级规则信息
     * 
     * @param locClassrule 班级规则信息
     * @return 结果
     */
    @Override
    public int insertLocClassrule(LocClassrule locClassrule)
    {
        return locClassruleMapper.insertLocClassrule(locClassrule);
    }

    /**
     * 修改班级规则信息
     * 
     * @param locClassrule 班级规则信息
     * @return 结果
     */
    @Override
    public int updateLocClassrule(LocClassrule locClassrule)
    {
        return locClassruleMapper.updateLocClassrule(locClassrule);
    }

    /**
     * 删除班级规则信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocClassruleByIds(String ids)
    {
        return locClassruleMapper.deleteLocClassruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除班级规则信息信息
     * 
     * @param classruleId 班级规则信息ID
     * @return 结果
     */
    @Override
    public int deleteLocClassruleById(Long classruleId)
    {
        return locClassruleMapper.deleteLocClassruleById(classruleId);
    }
}
