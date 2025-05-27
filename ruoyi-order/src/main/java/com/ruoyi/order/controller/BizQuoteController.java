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
import com.ruoyi.order.domain.BizQuote;
import com.ruoyi.order.service.IBizQuoteService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 报价Controller
 * 
 * @author ruoyi
 * @date 2025-05-26
 */
@RestController
@RequestMapping("/order/quote")
public class BizQuoteController extends BaseController
{
    @Autowired
    private IBizQuoteService bizQuoteService;

    /**
     * 查询报价列表
     */
    @PreAuthorize("@ss.hasPermi('order:quote:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizQuote bizQuote)
    {
        startPage();
        List<BizQuote> list = bizQuoteService.selectBizQuoteList(bizQuote);
        return getDataTable(list);
    }

    /**
     * 导出报价列表
     */
    @PreAuthorize("@ss.hasPermi('order:quote:export')")
    @Log(title = "报价", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizQuote bizQuote)
    {
        List<BizQuote> list = bizQuoteService.selectBizQuoteList(bizQuote);
        ExcelUtil<BizQuote> util = new ExcelUtil<BizQuote>(BizQuote.class);
        util.exportExcel(response, list, "报价数据");
    }

    /**
     * 获取报价详细信息
     */
    @PreAuthorize("@ss.hasPermi('order:quote:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bizQuoteService.selectBizQuoteById(id));
    }

    /**
     * 新增报价
     */
    @PreAuthorize("@ss.hasPermi('order:quote:add')")
    @Log(title = "报价", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizQuote bizQuote)
    {
        return toAjax(bizQuoteService.insertBizQuote(bizQuote));
    }

    /**
     * 修改报价
     */
    @PreAuthorize("@ss.hasPermi('order:quote:edit')")
    @Log(title = "报价", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizQuote bizQuote)
    {
        return toAjax(bizQuoteService.updateBizQuote(bizQuote));
    }

    /**
     * 删除报价
     */
    @PreAuthorize("@ss.hasPermi('order:quote:remove')")
    @Log(title = "报价", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizQuoteService.deleteBizQuoteByIds(ids));
    }
}
