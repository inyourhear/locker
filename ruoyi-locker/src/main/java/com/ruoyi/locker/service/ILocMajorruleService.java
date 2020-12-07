package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocMajorrule;

/**
 * 专业规则信息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public interface ILocMajorruleService 
{
    /**
     * 查询专业规则信息
     * 
     * @param majorruleId 专业规则信息ID
     * @return 专业规则信息
     */
    public LocMajorrule selectLocMajorruleById(Long majorruleId);

    /**
     * 查询专业规则信息列表
     * 
     * @param locMajorrule 专业规则信息
     * @return 专业规则信息集合
     */
    public List<LocMajorrule> selectLocMajorruleList(LocMajorrule locMajorrule);

    /**
     * 新增专业规则信息
     * 
     * @param locMajorrule 专业规则信息
     * @return 结果
     */
    public int insertLocMajorrule(LocMajorrule locMajorrule);

    /**
     * 修改专业规则信息
     * 
     * @param locMajorrule 专业规则信息
     * @return 结果
     */
    public int updateLocMajorrule(LocMajorrule locMajorrule);

    /**
     * 批量删除专业规则信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocMajorruleByIds(String ids);

    /**
     * 删除专业规则信息信息
     * 
     * @param majorruleId 专业规则信息ID
     * @return 结果
     */
    public int deleteLocMajorruleById(Long majorruleId);
}
