package com.ruoyi.order.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * orders对象 biz_order
 * 
 * @author ruoyi
 * @date 2025-05-27
 */
public class BizOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** quote_no */
    @Excel(name = "quote_no")
    private Long quoteId;

    /** customer po */
    @Excel(name = "customer po")
    private String customerPo;

    /** recipient */
    @Excel(name = "recipient")
    private String deliveryName;

    /** delivery address */
    @Excel(name = "delivery address")
    private String deliveryAddress;

    /** estimated ship date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "estimated ship date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date estimatedShipDate;

    /** ship date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "ship date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shipDate;

    /** status */
    @Excel(name = "status")
    private String status;

    /** note */
    @Excel(name = "note")
    private String note;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setQuoteId(Long quoteId) 
    {
        this.quoteId = quoteId;
    }

    public Long getQuoteId() 
    {
        return quoteId;
    }
    public void setCustomerPo(String customerPo) 
    {
        this.customerPo = customerPo;
    }

    public String getCustomerPo() 
    {
        return customerPo;
    }
    public void setDeliveryName(String deliveryName) 
    {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryName() 
    {
        return deliveryName;
    }
    public void setDeliveryAddress(String deliveryAddress) 
    {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() 
    {
        return deliveryAddress;
    }
    public void setEstimatedShipDate(Date estimatedShipDate) 
    {
        this.estimatedShipDate = estimatedShipDate;
    }

    public Date getEstimatedShipDate() 
    {
        return estimatedShipDate;
    }
    public void setShipDate(Date shipDate) 
    {
        this.shipDate = shipDate;
    }

    public Date getShipDate() 
    {
        return shipDate;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("quoteId", getQuoteId())
            .append("customerPo", getCustomerPo())
            .append("deliveryName", getDeliveryName())
            .append("deliveryAddress", getDeliveryAddress())
            .append("estimatedShipDate", getEstimatedShipDate())
            .append("shipDate", getShipDate())
            .append("status", getStatus())
            .append("note", getNote())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
