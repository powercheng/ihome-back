package com.ruoyi.customer.mapper;

import java.util.List;
import com.ruoyi.customer.domain.Customer;

/**
 * customerMapper接口
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
public interface CustomerMapper 
{
    /**
     * 查询customer
     * 
     * @param id customer主键
     * @return customer
     */
    public Customer selectCustomerById(Long id);

    /**
     * 查询customer列表
     * 
     * @param customer customer
     * @return customer集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增customer
     * 
     * @param customer customer
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改customer
     * 
     * @param customer customer
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 删除customer
     * 
     * @param id customer主键
     * @return 结果
     */
    public int deleteCustomerById(Long id);

    /**
     * 批量删除customer
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerByIds(Long[] ids);
}
