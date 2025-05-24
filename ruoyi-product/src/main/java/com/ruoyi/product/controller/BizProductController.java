package com.ruoyi.product.controller;

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
import com.ruoyi.product.domain.BizProduct;
import com.ruoyi.product.service.IBizProductService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * productsController
 * 
 * @author ruoyi
 * @date 2025-05-24
 */
@RestController
@RequestMapping("/product/products")
public class BizProductController extends BaseController
{
    @Autowired
    private IBizProductService bizProductService;

    /**
     * 查询products列表
     */
    @PreAuthorize("@ss.hasPermi('product:products:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizProduct bizProduct)
    {
        startPage();
        List<BizProduct> list = bizProductService.selectBizProductList(bizProduct);
        return getDataTable(list);
    }

    /**
     * 导出products列表
     */
    @PreAuthorize("@ss.hasPermi('product:products:export')")
    @Log(title = "products", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizProduct bizProduct)
    {
        List<BizProduct> list = bizProductService.selectBizProductList(bizProduct);
        ExcelUtil<BizProduct> util = new ExcelUtil<BizProduct>(BizProduct.class);
        util.exportExcel(response, list, "products数据");
    }

    /**
     * 获取products详细信息
     */
    @PreAuthorize("@ss.hasPermi('product:products:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bizProductService.selectBizProductById(id));
    }

    /**
     * 新增products
     */
    @PreAuthorize("@ss.hasPermi('product:products:add')")
    @Log(title = "products", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizProduct bizProduct)
    {
        return toAjax(bizProductService.insertBizProduct(bizProduct));
    }

    /**
     * 修改products
     */
    @PreAuthorize("@ss.hasPermi('product:products:edit')")
    @Log(title = "products", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizProduct bizProduct)
    {
        return toAjax(bizProductService.updateBizProduct(bizProduct));
    }

    /**
     * 删除products
     */
    @PreAuthorize("@ss.hasPermi('product:products:remove')")
    @Log(title = "products", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizProductService.deleteBizProductByIds(ids));
    }
}
