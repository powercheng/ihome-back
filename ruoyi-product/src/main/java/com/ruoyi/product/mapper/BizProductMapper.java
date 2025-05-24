package com.ruoyi.product.mapper;

import java.util.List;
import com.ruoyi.product.domain.BizProduct;

/**
 * productsMapper接口
 * 
 * @author ruoyi
 * @date 2025-05-24
 */
public interface BizProductMapper 
{
    /**
     * 查询products
     * 
     * @param id products主键
     * @return products
     */
    public BizProduct selectBizProductById(Long id);

    /**
     * 查询products列表
     * 
     * @param bizProduct products
     * @return products集合
     */
    public List<BizProduct> selectBizProductList(BizProduct bizProduct);

    /**
     * 新增products
     * 
     * @param bizProduct products
     * @return 结果
     */
    public int insertBizProduct(BizProduct bizProduct);

    /**
     * 修改products
     * 
     * @param bizProduct products
     * @return 结果
     */
    public int updateBizProduct(BizProduct bizProduct);

    /**
     * 删除products
     * 
     * @param id products主键
     * @return 结果
     */
    public int deleteBizProductById(Long id);

    /**
     * 批量删除products
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizProductByIds(Long[] ids);
}
