package com.ruoyi.order.service;

import java.util.List;
import com.ruoyi.order.domain.OrderEstimate;

/**
 * estimateService接口
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
public interface IOrderEstimateService 
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
     * 批量删除estimate
     * 
     * @param ids 需要删除的estimate主键集合
     * @return 结果
     */
    public int deleteOrderEstimateByIds(Long[] ids);

    /**
     * 删除estimate信息
     * 
     * @param id estimate主键
     * @return 结果
     */
    public int deleteOrderEstimateById(Long id);
}
