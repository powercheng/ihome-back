package com.ruoyi.product.service;

import java.util.List;
import com.ruoyi.product.domain.BizSupplier;

/**
 * supplierService接口
 * 
 * @author ruoyi
 * @date 2025-05-23
 */
public interface IBizSupplierService 
{
    /**
     * 查询supplier
     * 
     * @param id supplier主键
     * @return supplier
     */
    public BizSupplier selectBizSupplierById(Long id);

    /**
     * 查询supplier列表
     * 
     * @param bizSupplier supplier
     * @return supplier集合
     */
    public List<BizSupplier> selectBizSupplierList(BizSupplier bizSupplier);

    /**
     * 新增supplier
     * 
     * @param bizSupplier supplier
     * @return 结果
     */
    public int insertBizSupplier(BizSupplier bizSupplier);

    /**
     * 修改supplier
     * 
     * @param bizSupplier supplier
     * @return 结果
     */
    public int updateBizSupplier(BizSupplier bizSupplier);

    /**
     * 批量删除supplier
     * 
     * @param ids 需要删除的supplier主键集合
     * @return 结果
     */
    public int deleteBizSupplierByIds(Long[] ids);

    /**
     * 删除supplier信息
     * 
     * @param id supplier主键
     * @return 结果
     */
    public int deleteBizSupplierById(Long id);
}
