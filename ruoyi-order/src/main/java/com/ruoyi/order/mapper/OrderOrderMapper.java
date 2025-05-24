package com.ruoyi.order.mapper;

import java.util.List;
import com.ruoyi.order.domain.OrderOrder;

/**
 * orderMapper接口
 * 
 * @author ruoyi
 * @date 2024-09-25
 */
public interface OrderOrderMapper 
{
    /**
     * 查询order
     * 
     * @param id order主键
     * @return order
     */
    public OrderOrder selectOrderOrderById(Long id);

    /**
     * 查询order列表
     * 
     * @param orderOrder order
     * @return order集合
     */
    public List<OrderOrder> selectOrderOrderList(OrderOrder orderOrder);

    /**
     * 新增order
     * 
     * @param orderOrder order
     * @return 结果
     */
    public int insertOrderOrder(OrderOrder orderOrder);

    /**
     * 修改order
     * 
     * @param orderOrder order
     * @return 结果
     */
    public int updateOrderOrder(OrderOrder orderOrder);

    /**
     * 删除order
     * 
     * @param id order主键
     * @return 结果
     */
    public int deleteOrderOrderById(Long id);

    /**
     * 批量删除order
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderOrderByIds(Long[] ids);
}
