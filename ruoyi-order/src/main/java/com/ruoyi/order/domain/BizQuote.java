package com.ruoyi.order.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 报价对象 biz_quote
 * 
 * @author ruoyi
 * @date 2025-05-26
 */
public class BizQuote extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** customer_po */
    @Excel(name = "customer_po")
    private String customerPo;

    /** products */
    @Excel(name = "products")
    private String products;

    /** subtotal */
    @Excel(name = "subtotal")
    private BigDecimal subtotal;

    /** tax */
    @Excel(name = "tax")
    private BigDecimal tax;

    /** total */
    @Excel(name = "total")
    private BigDecimal total;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCustomerPo(String customerPo) 
    {
        this.customerPo = customerPo;
    }

    public String getCustomerPo() 
    {
        return customerPo;
    }
    public void setProducts(String products) 
    {
        this.products = products;
    }

    public String getProducts() 
    {
        return products;
    }
    public void setSubtotal(BigDecimal subtotal) 
    {
        this.subtotal = subtotal;
    }

    public BigDecimal getSubtotal() 
    {
        return subtotal;
    }
    public void setTax(BigDecimal tax) 
    {
        this.tax = tax;
    }

    public BigDecimal getTax() 
    {
        return tax;
    }
    public void setTotal(BigDecimal total) 
    {
        this.total = total;
    }

    public BigDecimal getTotal() 
    {
        return total;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerPo", getCustomerPo())
            .append("products", getProducts())
            .append("subtotal", getSubtotal())
            .append("tax", getTax())
            .append("total", getTotal())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
