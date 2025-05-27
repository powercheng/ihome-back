package com.ruoyi.order.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.order.mapper.BizOrderMapper;
import com.ruoyi.order.domain.BizOrder;
import com.ruoyi.order.service.IBizOrderService;

/**
 * ordersService业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-27
 */
@Service
public class BizOrderServiceImpl implements IBizOrderService 
{
    @Autowired
    private BizOrderMapper bizOrderMapper;

    /**
     * 查询orders
     * 
     * @param id orders主键
     * @return orders
     */
    @Override
    public BizOrder selectBizOrderById(Long id)
    {
        return bizOrderMapper.selectBizOrderById(id);
    }

    /**
     * 查询orders列表
     * 
     * @param bizOrder orders
     * @return orders
     */
    @Override
    public List<BizOrder> selectBizOrderList(BizOrder bizOrder)
    {
        return bizOrderMapper.selectBizOrderList(bizOrder);
    }

    /**
     * 新增orders
     * 
     * @param bizOrder orders
     * @return 结果
     */
    @Override
    public int insertBizOrder(BizOrder bizOrder)
    {
        bizOrder.setCreateTime(DateUtils.getNowDate());
        return bizOrderMapper.insertBizOrder(bizOrder);
    }

    /**
     * 修改orders
     * 
     * @param bizOrder orders
     * @return 结果
     */
    @Override
    public int updateBizOrder(BizOrder bizOrder)
    {
        bizOrder.setUpdateTime(DateUtils.getNowDate());
        return bizOrderMapper.updateBizOrder(bizOrder);
    }

    /**
     * 批量删除orders
     * 
     * @param ids 需要删除的orders主键
     * @return 结果
     */
    @Override
    public int deleteBizOrderByIds(Long[] ids)
    {
        return bizOrderMapper.deleteBizOrderByIds(ids);
    }

    /**
     * 删除orders信息
     * 
     * @param id orders主键
     * @return 结果
     */
    @Override
    public int deleteBizOrderById(Long id)
    {
        return bizOrderMapper.deleteBizOrderById(id);
    }
}
