package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocOpenscope;

/**
 * 开放范围信息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public interface ILocOpenscopeService 
{
    /**
     * 查询开放范围信息
     * 
     * @param openscopeId 开放范围信息ID
     * @return 开放范围信息
     */
    public LocOpenscope selectLocOpenscopeById(Long openscopeId);

    /**
     * 查询开放范围信息列表
     * 
     * @param locOpenscope 开放范围信息
     * @return 开放范围信息集合
     */
    public List<LocOpenscope> selectLocOpenscopeList(LocOpenscope locOpenscope);

    /**
     * 新增开放范围信息
     * 
     * @param locOpenscope 开放范围信息
     * @return 结果
     */
    public int insertLocOpenscope(LocOpenscope locOpenscope);

    /**
     * 修改开放范围信息
     * 
     * @param locOpenscope 开放范围信息
     * @return 结果
     */
    public int updateLocOpenscope(LocOpenscope locOpenscope);

    /**
     * 批量删除开放范围信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocOpenscopeByIds(String ids);

    /**
     * 删除开放范围信息信息
     * 
     * @param openscopeId 开放范围信息ID
     * @return 结果
     */
    public int deleteLocOpenscopeById(Long openscopeId);
}
