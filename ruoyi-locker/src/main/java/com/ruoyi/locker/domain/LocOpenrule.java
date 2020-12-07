package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 货柜开放规则对象 loc_openrule
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public class LocOpenrule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 货柜开放规则ID */
    @Excel(name = "货柜开放规则ID")
    private Integer openruleId;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer openruleContainerId;

    /** 货柜开放类型 */
    @Excel(name = "货柜开放类型")
    private Long openruleType;

    /** 需要几级审批 */
    @Excel(name = "需要几级审批")
    private Integer openruleApprove;

    public void setOpenruleId(Integer openruleId) 
    {
        this.openruleId = openruleId;
    }

    public Integer getOpenruleId() 
    {
        return openruleId;
    }
    public void setOpenruleContainerId(Integer openruleContainerId) 
    {
        this.openruleContainerId = openruleContainerId;
    }

    public Integer getOpenruleContainerId() 
    {
        return openruleContainerId;
    }
    public void setOpenruleType(Long openruleType) 
    {
        this.openruleType = openruleType;
    }

    public Long getOpenruleType() 
    {
        return openruleType;
    }
    public void setOpenruleApprove(Integer openruleApprove) 
    {
        this.openruleApprove = openruleApprove;
    }

    public Integer getOpenruleApprove() 
    {
        return openruleApprove;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("openruleId", getOpenruleId())
            .append("openruleContainerId", getOpenruleContainerId())
            .append("openruleType", getOpenruleType())
            .append("openruleApprove", getOpenruleApprove())
            .toString();
    }
}
