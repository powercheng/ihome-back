package com.ruoyi.order.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.order.mapper.BizQuoteMapper;
import com.ruoyi.order.domain.BizQuote;
import com.ruoyi.order.service.IBizQuoteService;

/**
 * 报价Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-26
 */
@Service
public class BizQuoteServiceImpl implements IBizQuoteService 
{
    @Autowired
    private BizQuoteMapper bizQuoteMapper;

    /**
     * 查询报价
     * 
     * @param id 报价主键
     * @return 报价
     */
    @Override
    public BizQuote selectBizQuoteById(Long id)
    {
        return bizQuoteMapper.selectBizQuoteById(id);
    }

    /**
     * 查询报价列表
     * 
     * @param bizQuote 报价
     * @return 报价
     */
    @Override
    public List<BizQuote> selectBizQuoteList(BizQuote bizQuote)
    {
        return bizQuoteMapper.selectBizQuoteList(bizQuote);
    }

    /**
     * 新增报价
     * 
     * @param bizQuote 报价
     * @return 结果
     */
    @Override
    public int insertBizQuote(BizQuote bizQuote)
    {
        bizQuote.setCreateTime(DateUtils.getNowDate());
        return bizQuoteMapper.insertBizQuote(bizQuote);
    }

    /**
     * 修改报价
     * 
     * @param bizQuote 报价
     * @return 结果
     */
    @Override
    public int updateBizQuote(BizQuote bizQuote)
    {
        bizQuote.setUpdateTime(DateUtils.getNowDate());
        return bizQuoteMapper.updateBizQuote(bizQuote);
    }

    /**
     * 批量删除报价
     * 
     * @param ids 需要删除的报价主键
     * @return 结果
     */
    @Override
    public int deleteBizQuoteByIds(Long[] ids)
    {
        return bizQuoteMapper.deleteBizQuoteByIds(ids);
    }

    /**
     * 删除报价信息
     * 
     * @param id 报价主键
     * @return 结果
     */
    @Override
    public int deleteBizQuoteById(Long id)
    {
        return bizQuoteMapper.deleteBizQuoteById(id);
    }
}
