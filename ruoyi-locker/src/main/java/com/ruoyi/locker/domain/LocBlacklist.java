package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 黑名单息对象 loc_blacklist
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public class LocBlacklist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 索引 */
    @Excel(name = "索引")
    private Integer id;

    /** 学号 */
    @Excel(name = "学号")
    private Integer blacklistId;

    /** 原因 */
    @Excel(name = "原因")
    private String blacklistReason;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setBlacklistId(Integer blacklistId) 
    {
        this.blacklistId = blacklistId;
    }

    public Integer getBlacklistId() 
    {
        return blacklistId;
    }
    public void setBlacklistReason(String blacklistReason) 
    {
        this.blacklistReason = blacklistReason;
    }

    public String getBlacklistReason() 
    {
        return blacklistReason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("blacklistId", getBlacklistId())
            .append("blacklistReason", getBlacklistReason())
            .toString();
    }
}
