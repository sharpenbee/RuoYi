package com.ruoyi.web.controller.monitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.dto.UserOperationCountDTO;
import com.ruoyi.system.domain.dto.UserModuleDTO;
import com.ruoyi.system.domain.dto.OperationTimeDistributionDTO;
import com.ruoyi.system.service.ISysOperLogService;

/**
 * 用户操作统计
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/monitor/userstat")
public class SysUserStatController extends BaseController
{
    private String prefix = "monitor/userstat";

    @Autowired
    private ISysOperLogService operLogService;

    @RequiresPermissions("monitor:userstat:view")
    @GetMapping()
    public String userstat()
    {
        return prefix + "/userstat";
    }

    /**
     * 查询用户操作次数排行（Top 10）
     */
    @RequiresPermissions("monitor:userstat:list")
    @PostMapping("/top10")
    @ResponseBody
    public AjaxResult selectUserOperationCountTop10(String beginTime, String endTime)
    {
        Map<String, Object> params = new HashMap<>();
        params.put("beginTime", beginTime);
        params.put("endTime", endTime);
        List<UserOperationCountDTO> list = operLogService.selectUserOperationCountTop10(params);
        return AjaxResult.success(list);
    }

    /**
     * 查询用户常用模块统计
     */
    @RequiresPermissions("monitor:userstat:list")
    @PostMapping("/modules")
    @ResponseBody
    public AjaxResult selectUserModuleStatistics(String beginTime, String endTime)
    {
        Map<String, Object> params = new HashMap<>();
        params.put("beginTime", beginTime);
        params.put("endTime", endTime);
        List<UserModuleDTO> list = operLogService.selectUserModuleStatistics(params);
        return AjaxResult.success(list);
    }

    /**
     * 查询操作时间段分布统计
     */
    @RequiresPermissions("monitor:userstat:list")
    @PostMapping("/distribution")
    @ResponseBody
    public AjaxResult selectOperationTimeDistribution(String beginTime, String endTime)
    {
        Map<String, Object> params = new HashMap<>();
        params.put("beginTime", beginTime);
        params.put("endTime", endTime);
        List<OperationTimeDistributionDTO> list = operLogService.selectOperationTimeDistribution(params);
        return AjaxResult.success(list);
    }
}