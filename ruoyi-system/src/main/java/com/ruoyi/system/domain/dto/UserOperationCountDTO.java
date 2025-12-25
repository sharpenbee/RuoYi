package com.ruoyi.system.domain.dto;

import java.util.Date;

/**
 * 用户操作次数统计DTO
 * 
 * @author ruoyi
 */
public class UserOperationCountDTO
{
    /** 用户名 */
    private String operName;
    
    /** 操作总次数 */
    private Long totalCount;
    
    /** 最后操作时间 */
    private Date lastOperTime;

    public String getOperName()
    {
        return operName;
    }

    public void setOperName(String operName)
    {
        this.operName = operName;
    }

    public Long getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(Long totalCount)
    {
        this.totalCount = totalCount;
    }

    public Date getLastOperTime()
    {
        return lastOperTime;
    }

    public void setLastOperTime(Date lastOperTime)
    {
        this.lastOperTime = lastOperTime;
    }
}