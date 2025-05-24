package com.ruoyi.order.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * estimate对象 order_estimate
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
public class OrderEstimate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** customer_id */
    private Long customerId;

    /** customer_name */
    @Excel(name = "customer_name")
    private String customerName;

    /** customer_phone */
    @Excel(name = "customer_phone")
    private String customerPhone;

    /** subTotal */
    @Excel(name = "subTotal")
    private BigDecimal subTotal;

    /** tax */
    @Excel(name = "tax")
    private BigDecimal tax;

    /** tax_rate */
    private BigDecimal taxRate;

    /** total */
    @Excel(name = "total")
    private BigDecimal total;

    /** discount */
    @Excel(name = "discount")
    private BigDecimal discount;

    /** Create_date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "Create_date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    @Excel(name = "manufacturer_id")
    private Long manufacturerId;

    /**  */
    @Excel(name = "color")
    private String color;

    /** $table.subTable.functionName信息 */
    private List<EstimateProducts> estimateProductsList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setCustomerPhone(String customerPhone) 
    {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() 
    {
        return customerPhone;
    }
    public void setSubTotal(BigDecimal subTotal) 
    {
        this.subTotal = subTotal;
    }

    public BigDecimal getSubTotal() 
    {
        return subTotal;
    }
    public void setTax(BigDecimal tax) 
    {
        this.tax = tax;
    }

    public BigDecimal getTax() 
    {
        return tax;
    }
    public void setTaxRate(BigDecimal taxRate) 
    {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxRate() 
    {
        return taxRate;
    }
    public void setTotal(BigDecimal total) 
    {
        this.total = total;
    }

    public BigDecimal getTotal() 
    {
        return total;
    }
    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }

    public List<EstimateProducts> getEstimateProductsList()
    {
        return estimateProductsList;
    }

    public void setEstimateProductsList(List<EstimateProducts> estimateProductsList)
    {
        this.estimateProductsList = estimateProductsList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("customerPhone", getCustomerPhone())
            .append("subTotal", getSubTotal())
            .append("tax", getTax())
            .append("taxRate", getTaxRate())
            .append("total", getTotal())
            .append("discount", getDiscount())
            .append("createDate", getCreateDate())
            .append("estimateProductsList", getEstimateProductsList())
                .append("manufacturerId", getManufacturerId())
                .append("color", getColor())
            .toString();
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
