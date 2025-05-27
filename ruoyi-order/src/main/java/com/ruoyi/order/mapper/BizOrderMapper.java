package com.ruoyi.order.mapper;

import java.util.List;
import com.ruoyi.order.domain.BizOrder;

/**
 * ordersMapper接口
 * 
 * @author ruoyi
 * @date 2025-05-27
 */
public interface BizOrderMapper 
{
    /**
     * 查询orders
     * 
     * @param id orders主键
     * @return orders
     */
    public BizOrder selectBizOrderById(Long id);

    /**
     * 查询orders列表
     * 
     * @param bizOrder orders
     * @return orders集合
     */
    public List<BizOrder> selectBizOrderList(BizOrder bizOrder);

    /**
     * 新增orders
     * 
     * @param bizOrder orders
     * @return 结果
     */
    public int insertBizOrder(BizOrder bizOrder);

    /**
     * 修改orders
     * 
     * @param bizOrder orders
     * @return 结果
     */
    public int updateBizOrder(BizOrder bizOrder);

    /**
     * 删除orders
     * 
     * @param id orders主键
     * @return 结果
     */
    public int deleteBizOrderById(Long id);

    /**
     * 批量删除orders
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizOrderByIds(Long[] ids);
}
