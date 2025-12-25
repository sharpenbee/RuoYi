package com.ruoyi.system.domain.dto;

import java.util.Date;

/**
 * 操作时间段分布统计DTO
 * 
 * @author ruoyi
 */
public class OperationTimeDistributionDTO
{
    /** 日期 */
    private Date date;
    
    /** 操作次数 */
    private Long count;

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Long getCount()
    {
        return count;
    }

    public void setCount(Long count)
    {
        this.count = count;
    }
}