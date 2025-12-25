package com.ruoyi.web.controller.monitor;

import java.util.List;
import java.util.Map;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.SysOperLog;
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

    @RequiresPermissions("monitor:userstat:list")
    @PostMapping("/userOperRank")
    @ResponseBody
    public AjaxResult userOperRank(SysOperLog operLog)
    {
        List<Map<String, Object>> list = operLogService.selectUserOperRank(operLog);
        return AjaxResult.success(list);
    }

    @RequiresPermissions("monitor:userstat:list")
    @PostMapping("/userCommonModule")
    @ResponseBody
    public AjaxResult userCommonModule(SysOperLog operLog)
    {
        List<Map<String, Object>> list = operLogService.selectUserCommonModule(operLog);
        return AjaxResult.success(list);
    }

    @RequiresPermissions("monitor:userstat:list")
    @PostMapping("/operTimeDistribution")
    @ResponseBody
    public AjaxResult operTimeDistribution(SysOperLog operLog)
    {
        List<Map<String, Object>> list = operLogService.selectOperTimeDistribution(operLog);
        return AjaxResult.success(list);
    }
}