package com.ruoyi.product.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * products对象 biz_product
 *
 * @author ruoyi
 * @date 2025-05-24
 */
public class BizProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 商品类型 */
    @Excel(name = "商品类型")
    private String type;

    /** 商品代码 */
    @Excel(name = "商品代码")
    private String code;

    /** 宽 */
    @Excel(name = "宽")
    private BigDecimal width;

    /** 高 */
    @Excel(name = "高")
    private BigDecimal height;

    /** 深 */
    @Excel(name = "深")
    private BigDecimal depth;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 原材料 */
    @Excel(name = "原材料")
    private Long materialId;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 参数 */
    @Excel(name = "参数")
    private String specification;

    /** 供应商 */
    @Excel(name = "供应商")
    private Long supplierId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setWidth(BigDecimal width)
    {
        this.width = width;
    }

    public BigDecimal getWidth()
    {
        return width;
    }
    public void setHeight(BigDecimal height)
    {
        this.height = height;
    }

    public BigDecimal getHeight()
    {
        return height;
    }
    public void setDepth(BigDecimal depth)
    {
        this.depth = depth;
    }

    public BigDecimal getDepth()
    {
        return depth;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setMaterialId(Long materialId)
    {
        this.materialId = materialId;
    }

    public Long getMaterialId()
    {
        return materialId;
    }
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getPrice()
    {
        return price;
    }
    public void setSpecification(String specification)
    {
        this.specification = specification;
    }

    public String getSpecification()
    {
        return specification;
    }
    public void setSupplierId(Long supplierId)
    {
        this.supplierId = supplierId;
    }

    public Long getSupplierId()
    {
        return supplierId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("type", getType())
                .append("code", getCode())
                .append("width", getWidth())
                .append("height", getHeight())
                .append("depth", getDepth())
                .append("description", getDescription())
                .append("materialId", getMaterialId())
                .append("price", getPrice())
                .append("specification", getSpecification())
                .append("supplierId", getSupplierId())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
