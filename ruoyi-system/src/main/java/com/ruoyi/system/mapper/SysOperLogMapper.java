package com.ruoyi.system.mapper;

import java.util.List;
import java.util.Map;
import com.ruoyi.system.domain.SysOperLog;
import com.ruoyi.system.domain.dto.UserOperationCountDTO;
import com.ruoyi.system.domain.dto.UserModuleDTO;
import com.ruoyi.system.domain.dto.OperationTimeDistributionDTO;

/**
 * 操作日志 数据层
 * 
 * @author ruoyi
 */
public interface SysOperLogMapper
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
    public int deleteOperLogByIds(String[] ids);
    
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
     * @param params 查询参数
     * @return 用户操作次数排行列表
     */
    public List<UserOperationCountDTO> selectUserOperationCountTop10(Map<String, Object> params);
    
    /**
     * 查询用户常用模块统计
     * 
     * @param params 查询参数
     * @return 用户常用模块统计列表
     */
    public List<UserModuleDTO> selectUserModuleStatistics(Map<String, Object> params);
    
    /**
     * 查询操作时间段分布统计
     * 
     * @param params 查询参数
     * @return 操作时间段分布统计列表
     */
    public List<OperationTimeDistributionDTO> selectOperationTimeDistribution(Map<String, Object> params);
}
