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
import com.ruoyi.order.domain.BizOrder;
import com.ruoyi.order.service.IBizOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * ordersController
 * 
 * @author ruoyi
 * @date 2025-05-27
 */
@RestController
@RequestMapping("/order/orders")
public class BizOrderController extends BaseController
{
    @Autowired
    private IBizOrderService bizOrderService;

    /**
     * 查询orders列表
     */
    @PreAuthorize("@ss.hasPermi('order:orders:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizOrder bizOrder)
    {
        startPage();
        List<BizOrder> list = bizOrderService.selectBizOrderList(bizOrder);
        return getDataTable(list);
    }

    /**
     * 导出orders列表
     */
    @PreAuthorize("@ss.hasPermi('order:orders:export')")
    @Log(title = "orders", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizOrder bizOrder)
    {
        List<BizOrder> list = bizOrderService.selectBizOrderList(bizOrder);
        ExcelUtil<BizOrder> util = new ExcelUtil<BizOrder>(BizOrder.class);
        util.exportExcel(response, list, "orders数据");
    }

    /**
     * 获取orders详细信息
     */
    @PreAuthorize("@ss.hasPermi('order:orders:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bizOrderService.selectBizOrderById(id));
    }

    /**
     * 新增orders
     */
    @PreAuthorize("@ss.hasPermi('order:orders:add')")
    @Log(title = "orders", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizOrder bizOrder)
    {
        return toAjax(bizOrderService.insertBizOrder(bizOrder));
    }

    /**
     * 修改orders
     */
    @PreAuthorize("@ss.hasPermi('order:orders:edit')")
    @Log(title = "orders", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizOrder bizOrder)
    {
        return toAjax(bizOrderService.updateBizOrder(bizOrder));
    }

    /**
     * 删除orders
     */
    @PreAuthorize("@ss.hasPermi('order:orders:remove')")
    @Log(title = "orders", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizOrderService.deleteBizOrderByIds(ids));
    }
}
