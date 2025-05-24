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
import com.ruoyi.order.domain.OrderOrder;
import com.ruoyi.order.service.IOrderOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * orderController
 * 
 * @author ruoyi
 * @date 2024-09-25
 */
@RestController
@RequestMapping("/order/order")
public class OrderOrderController extends BaseController
{
    @Autowired
    private IOrderOrderService orderOrderService;

    /**
     * 查询order列表
     */
    @PreAuthorize("@ss.hasPermi('order:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderOrder orderOrder)
    {
        startPage();
        List<OrderOrder> list = orderOrderService.selectOrderOrderList(orderOrder);
        return getDataTable(list);
    }

    /**
     * 导出order列表
     */
    @PreAuthorize("@ss.hasPermi('order:order:export')")
    @Log(title = "order", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OrderOrder orderOrder)
    {
        List<OrderOrder> list = orderOrderService.selectOrderOrderList(orderOrder);
        ExcelUtil<OrderOrder> util = new ExcelUtil<OrderOrder>(OrderOrder.class);
        util.exportExcel(response, list, "order数据");
    }

    /**
     * 获取order详细信息
     */
    @PreAuthorize("@ss.hasPermi('order:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(orderOrderService.selectOrderOrderById(id));
    }

    /**
     * 新增order
     */
    @PreAuthorize("@ss.hasPermi('order:order:add')")
    @Log(title = "order", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderOrder orderOrder)
    {
        return toAjax(orderOrderService.insertOrderOrder(orderOrder));
    }

    /**
     * 修改order
     */
    @PreAuthorize("@ss.hasPermi('order:order:edit')")
    @Log(title = "order", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderOrder orderOrder)
    {
        return toAjax(orderOrderService.updateOrderOrder(orderOrder));
    }

    /**
     * 删除order
     */
    @PreAuthorize("@ss.hasPermi('order:order:remove')")
    @Log(title = "order", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(orderOrderService.deleteOrderOrderByIds(ids));
    }
}
