package com.ruoyi.order.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * order对象 order_order
 * 
 * @author ruoyi
 * @date 2024-09-25
 */
public class OrderOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** estimate_id */
    private Long estimateId;

    /** customer_name */
    @Excel(name = "customer_name")
    private String customerName;

    /** customer_phone */
    @Excel(name = "customer_phone")
    private String customerPhone;

    /** customer_address */
    @Excel(name = "customer_address")
    private String customerAddress;

    /** order_amount */
    @Excel(name = "order_amount")
    private BigDecimal orderAmount;

    /** delivery_date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "delivery_date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    /** current_status */
    @Excel(name = "current_status")
    private Long currentStatus;

    /** is_delivery */
    @Excel(name = "is_delivery")
    private Integer isDelivery;

    /** is_install */
    @Excel(name = "is_install")
    private Integer isInstall;

    /** create_date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "create_date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEstimateId(Long estimateId) 
    {
        this.estimateId = estimateId;
    }

    public Long getEstimateId() 
    {
        return estimateId;
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
    public void setCustomerAddress(String customerAddress) 
    {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress() 
    {
        return customerAddress;
    }
    public void setOrderAmount(BigDecimal orderAmount) 
    {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getOrderAmount() 
    {
        return orderAmount;
    }
    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
    }
    public void setCurrentStatus(Long currentStatus) 
    {
        this.currentStatus = currentStatus;
    }

    public Long getCurrentStatus() 
    {
        return currentStatus;
    }
    public void setIsDelivery(Integer isDelivery) 
    {
        this.isDelivery = isDelivery;
    }

    public Integer getIsDelivery() 
    {
        return isDelivery;
    }
    public void setIsInstall(Integer isInstall) 
    {
        this.isInstall = isInstall;
    }

    public Integer getIsInstall() 
    {
        return isInstall;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("estimateId", getEstimateId())
            .append("customerName", getCustomerName())
            .append("customerPhone", getCustomerPhone())
            .append("customerAddress", getCustomerAddress())
            .append("orderAmount", getOrderAmount())
            .append("deliveryDate", getDeliveryDate())
            .append("currentStatus", getCurrentStatus())
            .append("isDelivery", getIsDelivery())
            .append("isInstall", getIsInstall())
            .append("createDate", getCreateDate())
            .toString();
    }
}
