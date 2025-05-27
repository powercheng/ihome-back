package com.ruoyi.order.service;

import java.util.List;
import com.ruoyi.order.domain.BizQuote;

/**
 * 报价Service接口
 * 
 * @author ruoyi
 * @date 2025-05-26
 */
public interface IBizQuoteService 
{
    /**
     * 查询报价
     * 
     * @param id 报价主键
     * @return 报价
     */
    public BizQuote selectBizQuoteById(Long id);

    /**
     * 查询报价列表
     * 
     * @param bizQuote 报价
     * @return 报价集合
     */
    public List<BizQuote> selectBizQuoteList(BizQuote bizQuote);

    /**
     * 新增报价
     * 
     * @param bizQuote 报价
     * @return 结果
     */
    public int insertBizQuote(BizQuote bizQuote);

    /**
     * 修改报价
     * 
     * @param bizQuote 报价
     * @return 结果
     */
    public int updateBizQuote(BizQuote bizQuote);

    /**
     * 批量删除报价
     * 
     * @param ids 需要删除的报价主键集合
     * @return 结果
     */
    public int deleteBizQuoteByIds(Long[] ids);

    /**
     * 删除报价信息
     * 
     * @param id 报价主键
     * @return 结果
     */
    public int deleteBizQuoteById(Long id);
}
