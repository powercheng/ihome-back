package com.ruoyi.order.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.order.mapper.OrderOrderMapper;
import com.ruoyi.order.domain.OrderOrder;
import com.ruoyi.order.service.IOrderOrderService;

/**
 * orderService业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-25
 */
@Service
public class OrderOrderServiceImpl implements IOrderOrderService 
{
    @Autowired
    private OrderOrderMapper orderOrderMapper;

    /**
     * 查询order
     * 
     * @param id order主键
     * @return order
     */
    @Override
    public OrderOrder selectOrderOrderById(Long id)
    {
        return orderOrderMapper.selectOrderOrderById(id);
    }

    /**
     * 查询order列表
     * 
     * @param orderOrder order
     * @return order
     */
    @Override
    public List<OrderOrder> selectOrderOrderList(OrderOrder orderOrder)
    {
        return orderOrderMapper.selectOrderOrderList(orderOrder);
    }

    /**
     * 新增order
     * 
     * @param orderOrder order
     * @return 结果
     */
    @Override
    public int insertOrderOrder(OrderOrder orderOrder)
    {
        return orderOrderMapper.insertOrderOrder(orderOrder);
    }

    /**
     * 修改order
     * 
     * @param orderOrder order
     * @return 结果
     */
    @Override
    public int updateOrderOrder(OrderOrder orderOrder)
    {
        return orderOrderMapper.updateOrderOrder(orderOrder);
    }

    /**
     * 批量删除order
     * 
     * @param ids 需要删除的order主键
     * @return 结果
     */
    @Override
    public int deleteOrderOrderByIds(Long[] ids)
    {
        return orderOrderMapper.deleteOrderOrderByIds(ids);
    }

    /**
     * 删除order信息
     * 
     * @param id order主键
     * @return 结果
     */
    @Override
    public int deleteOrderOrderById(Long id)
    {
        return orderOrderMapper.deleteOrderOrderById(id);
    }
}
