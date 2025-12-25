package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.SysOperLog;
import com.ruoyi.system.domain.dto.UserOperationCountDTO;
import com.ruoyi.system.domain.dto.UserModuleDTO;
import com.ruoyi.system.domain.dto.OperationTimeDistributionDTO;
import com.ruoyi.system.mapper.SysOperLogMapper;
import com.ruoyi.system.service.ISysOperLogService;

/**
 * 操作日志 服务层处理
 * 
 * @author ruoyi
 */
@Service
public class SysOperLogServiceImpl implements ISysOperLogService
{
    @Autowired
    private SysOperLogMapper operLogMapper;

    /**
     * 新增操作日志
     * 
     * @param operLog 操作日志对象
     */
    @Override
    public void insertOperlog(SysOperLog operLog)
    {
        operLogMapper.insertOperlog(operLog);
    }

    /**
     * 查询系统操作日志集合
     * 
     * @param operLog 操作日志对象
     * @return 操作日志集合
     */
    @Override
    public List<SysOperLog> selectOperLogList(SysOperLog operLog)
    {
        return operLogMapper.selectOperLogList(operLog);
    }

    /**
     * 批量删除系统操作日志
     * 
     * @param ids 需要删除的数据
     * @return
     */
    @Override
    public int deleteOperLogByIds(String ids)
    {
        return operLogMapper.deleteOperLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 查询操作日志详细
     * 
     * @param operId 操作ID
     * @return 操作日志对象
     */
    @Override
    public SysOperLog selectOperLogById(Long operId)
    {
        return operLogMapper.selectOperLogById(operId);
    }

    /**
     * 清空操作日志
     */
    @Override
    public void cleanOperLog()
    {
        operLogMapper.cleanOperLog();
    }
    
    /**
     * 查询用户操作次数排行（Top 10）
     * 
     * @param params 查询参数
     * @return 用户操作次数排行列表
     */
    @Override
    public List<UserOperationCountDTO> selectUserOperationCountTop10(Map<String, Object> params)
    {
        return operLogMapper.selectUserOperationCountTop10(params);
    }
    
    /**
     * 查询用户常用模块统计
     * 
     * @param params 查询参数
     * @return 用户常用模块统计列表
     */
    @Override
    public List<UserModuleDTO> selectUserModuleStatistics(Map<String, Object> params)
    {
        return operLogMapper.selectUserModuleStatistics(params);
    }
    
    /**
     * 查询操作时间段分布统计
     * 
     * @param params 查询参数
     * @return 操作时间段分布统计列表
     */
    @Override
    public List<OperationTimeDistributionDTO> selectOperationTimeDistribution(Map<String, Object> params)
    {
        return operLogMapper.selectOperationTimeDistribution(params);
    }
}
