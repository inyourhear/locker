package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开放范围信息对象 loc_openscope
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public class LocOpenscope extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 开放范围ID */
    @Excel(name = "开放范围ID")
    private Long openscopeId;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer openscopeContainerId;

    /** 规则表ID */
    @Excel(name = "规则表ID")
    private Integer openscopeRuletableId;

    /** 规则ID */
    @Excel(name = "规则ID")
    private Long openscopeRuleId;

    public void setOpenscopeId(Long openscopeId) 
    {
        this.openscopeId = openscopeId;
    }

    public Long getOpenscopeId() 
    {
        return openscopeId;
    }
    public void setOpenscopeContainerId(Integer openscopeContainerId) 
    {
        this.openscopeContainerId = openscopeContainerId;
    }

    public Integer getOpenscopeContainerId() 
    {
        return openscopeContainerId;
    }
    public void setOpenscopeRuletableId(Integer openscopeRuletableId) 
    {
        this.openscopeRuletableId = openscopeRuletableId;
    }

    public Integer getOpenscopeRuletableId() 
    {
        return openscopeRuletableId;
    }
    public void setOpenscopeRuleId(Long openscopeRuleId) 
    {
        this.openscopeRuleId = openscopeRuleId;
    }

    public Long getOpenscopeRuleId() 
    {
        return openscopeRuleId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("openscopeId", getOpenscopeId())
            .append("openscopeContainerId", getOpenscopeContainerId())
            .append("openscopeRuletableId", getOpenscopeRuletableId())
            .append("openscopeRuleId", getOpenscopeRuleId())
            .toString();
    }
}
