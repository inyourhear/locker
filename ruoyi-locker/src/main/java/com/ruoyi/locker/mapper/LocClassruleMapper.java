package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocClassrule;

/**
 * 班级规则信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public interface LocClassruleMapper 
{
    /**
     * 查询班级规则信息
     * 
     * @param classruleId 班级规则信息ID
     * @return 班级规则信息
     */
    public LocClassrule selectLocClassruleById(Long classruleId);

    /**
     * 查询班级规则信息列表
     * 
     * @param locClassrule 班级规则信息
     * @return 班级规则信息集合
     */
    public List<LocClassrule> selectLocClassruleList(LocClassrule locClassrule);

    /**
     * 新增班级规则信息
     * 
     * @param locClassrule 班级规则信息
     * @return 结果
     */
    public int insertLocClassrule(LocClassrule locClassrule);

    /**
     * 修改班级规则信息
     * 
     * @param locClassrule 班级规则信息
     * @return 结果
     */
    public int updateLocClassrule(LocClassrule locClassrule);

    /**
     * 删除班级规则信息
     * 
     * @param classruleId 班级规则信息ID
     * @return 结果
     */
    public int deleteLocClassruleById(Long classruleId);

    /**
     * 批量删除班级规则信息
     * 
     * @param classruleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocClassruleByIds(String[] classruleIds);
}
