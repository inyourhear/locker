package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 格子信息对象 loc_box
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public class LocBox extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 索引 */
    private Integer id;

    /** 编码 */
    @Excel(name = "编码")
    private String boxCode;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer boxContainerId;

    /** 控制端口ID */
    @Excel(name = "控制端口ID")
    private Integer boxPortId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer boxState;

    /** 当前所属人员 */
    @Excel(name = "当前所属人员")
    private Integer boxStudentId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setBoxCode(String boxCode) 
    {
        this.boxCode = boxCode;
    }

    public String getBoxCode() 
    {
        return boxCode;
    }
    public void setBoxContainerId(Integer boxContainerId) 
    {
        this.boxContainerId = boxContainerId;
    }

    public Integer getBoxContainerId() 
    {
        return boxContainerId;
    }
    public void setBoxPortId(Integer boxPortId) 
    {
        this.boxPortId = boxPortId;
    }

    public Integer getBoxPortId() 
    {
        return boxPortId;
    }
    public void setBoxState(Integer boxState) 
    {
        this.boxState = boxState;
    }

    public Integer getBoxState() 
    {
        return boxState;
    }
    public void setBoxStudentId(Integer boxStudentId) 
    {
        this.boxStudentId = boxStudentId;
    }

    public Integer getBoxStudentId() 
    {
        return boxStudentId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("boxCode", getBoxCode())
            .append("boxContainerId", getBoxContainerId())
            .append("boxPortId", getBoxPortId())
            .append("boxState", getBoxState())
            .append("boxStudentId", getBoxStudentId())
            .toString();
    }
}
