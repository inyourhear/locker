package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocOpenscopeMapper;
import com.ruoyi.locker.domain.LocOpenscope;
import com.ruoyi.locker.service.ILocOpenscopeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 开放范围信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Service
public class LocOpenscopeServiceImpl implements ILocOpenscopeService 
{
    @Autowired
    private LocOpenscopeMapper locOpenscopeMapper;

    /**
     * 查询开放范围信息
     * 
     * @param openscopeId 开放范围信息ID
     * @return 开放范围信息
     */
    @Override
    public LocOpenscope selectLocOpenscopeById(Long openscopeId)
    {
        return locOpenscopeMapper.selectLocOpenscopeById(openscopeId);
    }

    /**
     * 查询开放范围信息列表
     * 
     * @param locOpenscope 开放范围信息
     * @return 开放范围信息
     */
    @Override
    public List<LocOpenscope> selectLocOpenscopeList(LocOpenscope locOpenscope)
    {
        return locOpenscopeMapper.selectLocOpenscopeList(locOpenscope);
    }

    /**
     * 新增开放范围信息
     * 
     * @param locOpenscope 开放范围信息
     * @return 结果
     */
    @Override
    public int insertLocOpenscope(LocOpenscope locOpenscope)
    {
        return locOpenscopeMapper.insertLocOpenscope(locOpenscope);
    }

    /**
     * 修改开放范围信息
     * 
     * @param locOpenscope 开放范围信息
     * @return 结果
     */
    @Override
    public int updateLocOpenscope(LocOpenscope locOpenscope)
    {
        return locOpenscopeMapper.updateLocOpenscope(locOpenscope);
    }

    /**
     * 删除开放范围信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocOpenscopeByIds(String ids)
    {
        return locOpenscopeMapper.deleteLocOpenscopeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开放范围信息信息
     * 
     * @param openscopeId 开放范围信息ID
     * @return 结果
     */
    @Override
    public int deleteLocOpenscopeById(Long openscopeId)
    {
        return locOpenscopeMapper.deleteLocOpenscopeById(openscopeId);
    }
}
