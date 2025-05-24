package com.ruoyi.order.mapper;

import java.util.List;
import com.ruoyi.order.domain.OrderEstimate;
import com.ruoyi.order.domain.EstimateProducts;

/**
 * estimateMapper接口
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
public interface OrderEstimateMapper 
{
    /**
     * 查询estimate
     * 
     * @param id estimate主键
     * @return estimate
     */
    public OrderEstimate selectOrderEstimateById(Long id);

    /**
     * 查询estimate列表
     * 
     * @param orderEstimate estimate
     * @return estimate集合
     */
    public List<OrderEstimate> selectOrderEstimateList(OrderEstimate orderEstimate);

    /**
     * 新增estimate
     * 
     * @param orderEstimate estimate
     * @return 结果
     */
    public int insertOrderEstimate(OrderEstimate orderEstimate);

    /**
     * 修改estimate
     * 
     * @param orderEstimate estimate
     * @return 结果
     */
    public int updateOrderEstimate(OrderEstimate orderEstimate);

    /**
     * 删除estimate
     * 
     * @param id estimate主键
     * @return 结果
     */
    public int deleteOrderEstimateById(Long id);

    /**
     * 批量删除estimate
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderEstimateByIds(Long[] ids);

    /**
     * 批量删除${subTable.functionName}
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEstimateProductsByEstimateIds(Long[] ids);
    
    /**
     * 批量新增${subTable.functionName}
     * 
     * @param estimateProductsList ${subTable.functionName}列表
     * @return 结果
     */
    public int batchEstimateProducts(List<EstimateProducts> estimateProductsList);
    

    /**
     * 通过estimate主键删除${subTable.functionName}信息
     * 
     * @param id estimateID
     * @return 结果
     */
    public int deleteEstimateProductsByEstimateId(Long id);
}
