package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocBox;

/**
 * 格子信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public interface LocBoxMapper 
{
    /**
     * 查询格子信息
     * 
     * @param id 格子信息ID
     * @return 格子信息
     */
    public LocBox selectLocBoxById(Integer id);

    /**
     * 查询格子信息列表
     * 
     * @param locBox 格子信息
     * @return 格子信息集合
     */
    public List<LocBox> selectLocBoxList(LocBox locBox);

    /**
     * 新增格子信息
     * 
     * @param locBox 格子信息
     * @return 结果
     */
    public int insertLocBox(LocBox locBox);

    /**
     * 修改格子信息
     * 
     * @param locBox 格子信息
     * @return 结果
     */
    public int updateLocBox(LocBox locBox);

    /**
     * 删除格子信息
     * 
     * @param id 格子信息ID
     * @return 结果
     */
    public int deleteLocBoxById(Integer id);

    /**
     * 批量删除格子信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocBoxByIds(String[] ids);
}
