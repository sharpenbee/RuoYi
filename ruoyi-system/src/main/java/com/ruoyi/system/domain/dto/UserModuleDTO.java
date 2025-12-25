package com.ruoyi.system.domain.dto;

/**
 * 用户常用模块统计DTO
 * 
 * @author ruoyi
 */
public class UserModuleDTO
{
    /** 用户名 */
    private String operName;
    
    /** 模块标题 */
    private String title;
    
    /** 操作次数 */
    private Long count;

    public String getOperName()
    {
        return operName;
    }

    public void setOperName(String operName)
    {
        this.operName = operName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
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