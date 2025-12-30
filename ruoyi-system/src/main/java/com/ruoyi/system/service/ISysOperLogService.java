package com.ruoyi.system.service;

import java.util.List;
import java.util.Map;
import com.ruoyi.system.domain.SysOperLog;

/**
 * 操作日志 服务层
 * 
 * @author ruoyi
 */
public interface ISysOperLogService
{
    /**
     * 新增操作日志
     * 
     * @param operLog 操作日志对象
     */
    public void insertOperlog(SysOperLog operLog);

    /**
     * 查询系统操作日志集合
     * 
     * @param operLog 操作日志对象
     * @return 操作日志集合
     */
    public List<SysOperLog> selectOperLogList(SysOperLog operLog);

    /**
     * 批量删除系统操作日志
     * 
     * @param ids 需要删除的数据
     * @return 结果
     */
    public int deleteOperLogByIds(String ids);

    /**
     * 查询操作日志详细
     * 
     * @param operId 操作ID
     * @return 操作日志对象
     */
    public SysOperLog selectOperLogById(Long operId);

    /**
     * 清空操作日志
     */
    public void cleanOperLog();
    
    /**
     * 查询用户操作次数排行（Top 10）
     * 
     * @param operLog 操作日志对象
     * @return 用户操作次数排行
     */
    public List<Map<String, Object>> selectUserOperRank(SysOperLog operLog);
    
    /**
     * 查询用户常用模块统计
     * 
     * @param operLog 操作日志对象
     * @return 用户常用模块统计
     */
    public List<Map<String, Object>> selectUserCommonModule(SysOperLog operLog);
    
    /**
     * 查询操作时间段分布
     * 
     * @param operLog 操作日志对象
     * @return 操作时间段分布
     */
    public List<Map<String, Object>> selectOperTimeDistribution(SysOperLog operLog);
}
