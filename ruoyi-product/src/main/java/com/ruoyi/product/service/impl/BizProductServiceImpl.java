package com.ruoyi.product.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.product.mapper.BizProductMapper;
import com.ruoyi.product.domain.BizProduct;
import com.ruoyi.product.service.IBizProductService;

/**
 * productsService业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-24
 */
@Service
public class BizProductServiceImpl implements IBizProductService 
{
    @Autowired
    private BizProductMapper bizProductMapper;

    /**
     * 查询products
     * 
     * @param id products主键
     * @return products
     */
    @Override
    public BizProduct selectBizProductById(Long id)
    {
        return bizProductMapper.selectBizProductById(id);
    }

    /**
     * 查询products列表
     * 
     * @param bizProduct products
     * @return products
     */
    @Override
    public List<BizProduct> selectBizProductList(BizProduct bizProduct)
    {
        return bizProductMapper.selectBizProductList(bizProduct);
    }

    /**
     * 新增products
     * 
     * @param bizProduct products
     * @return 结果
     */
    @Override
    public int insertBizProduct(BizProduct bizProduct)
    {
        bizProduct.setCreateTime(DateUtils.getNowDate());
        return bizProductMapper.insertBizProduct(bizProduct);
    }

    /**
     * 修改products
     * 
     * @param bizProduct products
     * @return 结果
     */
    @Override
    public int updateBizProduct(BizProduct bizProduct)
    {
        bizProduct.setUpdateTime(DateUtils.getNowDate());
        return bizProductMapper.updateBizProduct(bizProduct);
    }

    /**
     * 批量删除products
     * 
     * @param ids 需要删除的products主键
     * @return 结果
     */
    @Override
    public int deleteBizProductByIds(Long[] ids)
    {
        return bizProductMapper.deleteBizProductByIds(ids);
    }

    /**
     * 删除products信息
     * 
     * @param id products主键
     * @return 结果
     */
    @Override
    public int deleteBizProductById(Long id)
    {
        return bizProductMapper.deleteBizProductById(id);
    }
}
