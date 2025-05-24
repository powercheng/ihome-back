package com.ruoyi.customer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * customer对象 customer
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** first_name */
    @Excel(name = "name")
    private String name;

    public void setCompany(String company) {
        this.company = company;
    }

    /** company */
    private String company;

    /** phone */
    @Excel(name = "phone")
    private String phone;

    /** note */
    private String note;

    /** follower */
    @Excel(name = "follower")
    private String follower;

    /** designer */
    @Excel(name = "designer")
    private String designer;

    /** source */
    @Excel(name = "source")
    private String source;

    /** category */
    @Excel(name = "category")
    private String category;

    /** create_date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "create_date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** current_status */
    @Excel(name = "current_status")
    private Integer currentStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }
    public void setFollower(String follower) 
    {
        this.follower = follower;
    }

    public String getFollower() 
    {
        return follower;
    }
    public void setDesigner(String designer) 
    {
        this.designer = designer;
    }

    public String getDesigner() 
    {
        return designer;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setCurrentStatus(Integer currentStatus) 
    {
        this.currentStatus = currentStatus;
    }

    public Integer getCurrentStatus() 
    {
        return currentStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("company", getCompany())
            .append("phone", getPhone())
            .append("note", getNote())
            .append("follower", getFollower())
            .append("designer", getDesigner())
            .append("source", getSource())
            .append("category", getCategory())
            .append("createDate", getCreateDate())
            .append("currentStatus", getCurrentStatus())
            .toString();
    }
}
