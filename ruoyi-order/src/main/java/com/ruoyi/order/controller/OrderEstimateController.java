package com.ruoyi.order.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.order.domain.OrderEstimate;
import com.ruoyi.order.service.IOrderEstimateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * estimateController
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
@RestController
@RequestMapping("/order/estimate")
public class OrderEstimateController extends BaseController
{
    @Autowired
    private IOrderEstimateService orderEstimateService;

    /**
     * 查询estimate列表
     */
    @PreAuthorize("@ss.hasPermi('order:estimate:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderEstimate orderEstimate)
    {
        startPage();
        List<OrderEstimate> list = orderEstimateService.selectOrderEstimateList(orderEstimate);
        return getDataTable(list);
    }

    /**
     * 导出estimate列表
     */
    @PreAuthorize("@ss.hasPermi('order:estimate:export')")
    @Log(title = "estimate", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OrderEstimate orderEstimate)
    {
        List<OrderEstimate> list = orderEstimateService.selectOrderEstimateList(orderEstimate);
        ExcelUtil<OrderEstimate> util = new ExcelUtil<OrderEstimate>(OrderEstimate.class);
        util.exportExcel(response, list, "estimate数据");
    }

    /**
     * 获取estimate详细信息
     */
    @PreAuthorize("@ss.hasPermi('order:estimate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(orderEstimateService.selectOrderEstimateById(id));
    }

    /**
     * 新增estimate
     */
    @PreAuthorize("@ss.hasPermi('order:estimate:add')")
    @Log(title = "estimate", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderEstimate orderEstimate)
    {
        return toAjax(orderEstimateService.insertOrderEstimate(orderEstimate));
    }

    /**
     * 修改estimate
     */
    @PreAuthorize("@ss.hasPermi('order:estimate:edit')")
    @Log(title = "estimate", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderEstimate orderEstimate)
    {
        return toAjax(orderEstimateService.updateOrderEstimate(orderEstimate));
    }

    /**
     * 删除estimate
     */
    @PreAuthorize("@ss.hasPermi('order:estimate:remove')")
    @Log(title = "estimate", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(orderEstimateService.deleteOrderEstimateByIds(ids));
    }
}
