package com.ruoyi.order.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.order.domain.EstimateProducts;
import com.ruoyi.order.mapper.OrderEstimateMapper;
import com.ruoyi.order.domain.OrderEstimate;
import com.ruoyi.order.service.IOrderEstimateService;

/**
 * estimateService业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-16
 */
@Service
public class OrderEstimateServiceImpl implements IOrderEstimateService 
{
    @Autowired
    private OrderEstimateMapper orderEstimateMapper;

    /**
     * 查询estimate
     * 
     * @param id estimate主键
     * @return estimate
     */
    @Override
    public OrderEstimate selectOrderEstimateById(Long id)
    {
        return orderEstimateMapper.selectOrderEstimateById(id);
    }

    /**
     * 查询estimate列表
     * 
     * @param orderEstimate estimate
     * @return estimate
     */
    @Override
    public List<OrderEstimate> selectOrderEstimateList(OrderEstimate orderEstimate)
    {
        return orderEstimateMapper.selectOrderEstimateList(orderEstimate);
    }

    /**
     * 新增estimate
     * 
     * @param orderEstimate estimate
     * @return 结果
     */
    @Transactional
    @Override
    public int insertOrderEstimate(OrderEstimate orderEstimate)
    {
        int rows = orderEstimateMapper.insertOrderEstimate(orderEstimate);
        insertEstimateProducts(orderEstimate);
        return rows;
    }

    /**
     * 修改estimate
     * 
     * @param orderEstimate estimate
     * @return 结果
     */
    @Transactional
    @Override
    public int updateOrderEstimate(OrderEstimate orderEstimate)
    {
        orderEstimateMapper.deleteEstimateProductsByEstimateId(orderEstimate.getId());
        insertEstimateProducts(orderEstimate);
        return orderEstimateMapper.updateOrderEstimate(orderEstimate);
    }

    /**
     * 批量删除estimate
     * 
     * @param ids 需要删除的estimate主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteOrderEstimateByIds(Long[] ids)
    {
        orderEstimateMapper.deleteEstimateProductsByEstimateIds(ids);
        return orderEstimateMapper.deleteOrderEstimateByIds(ids);
    }

    /**
     * 删除estimate信息
     * 
     * @param id estimate主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteOrderEstimateById(Long id)
    {
        orderEstimateMapper.deleteEstimateProductsByEstimateId(id);
        return orderEstimateMapper.deleteOrderEstimateById(id);
    }

    /**
     * 新增${subTable.functionName}信息
     * 
     * @param orderEstimate estimate对象
     */
    public void insertEstimateProducts(OrderEstimate orderEstimate)
    {
        List<EstimateProducts> estimateProductsList = orderEstimate.getEstimateProductsList();
        Long id = orderEstimate.getId();
        if (StringUtils.isNotNull(estimateProductsList))
        {
            List<EstimateProducts> list = new ArrayList<EstimateProducts>();
            for (EstimateProducts estimateProducts : estimateProductsList)
            {
                estimateProducts.setEstimateId(id);
                list.add(estimateProducts);
            }
            if (list.size() > 0)
            {
                orderEstimateMapper.batchEstimateProducts(list);
            }
        }
    }
}
