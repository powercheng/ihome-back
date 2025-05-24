package com.ruoyi.product.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.product.mapper.BizSupplierMapper;
import com.ruoyi.product.domain.BizSupplier;
import com.ruoyi.product.service.IBizSupplierService;

/**
 * supplierService业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-23
 */
@Service
public class BizSupplierServiceImpl implements IBizSupplierService 
{
    @Autowired
    private BizSupplierMapper bizSupplierMapper;

    /**
     * 查询supplier
     * 
     * @param id supplier主键
     * @return supplier
     */
    @Override
    public BizSupplier selectBizSupplierById(Long id)
    {
        return bizSupplierMapper.selectBizSupplierById(id);
    }

    /**
     * 查询supplier列表
     * 
     * @param bizSupplier supplier
     * @return supplier
     */
    @Override
    public List<BizSupplier> selectBizSupplierList(BizSupplier bizSupplier)
    {
        return bizSupplierMapper.selectBizSupplierList(bizSupplier);
    }

    /**
     * 新增supplier
     * 
     * @param bizSupplier supplier
     * @return 结果
     */
    @Override
    public int insertBizSupplier(BizSupplier bizSupplier)
    {
        bizSupplier.setCreateTime(DateUtils.getNowDate());
        return bizSupplierMapper.insertBizSupplier(bizSupplier);
    }

    /**
     * 修改supplier
     * 
     * @param bizSupplier supplier
     * @return 结果
     */
    @Override
    public int updateBizSupplier(BizSupplier bizSupplier)
    {
        bizSupplier.setUpdateTime(DateUtils.getNowDate());
        return bizSupplierMapper.updateBizSupplier(bizSupplier);
    }

    /**
     * 批量删除supplier
     * 
     * @param ids 需要删除的supplier主键
     * @return 结果
     */
    @Override
    public int deleteBizSupplierByIds(Long[] ids)
    {
        return bizSupplierMapper.deleteBizSupplierByIds(ids);
    }

    /**
     * 删除supplier信息
     * 
     * @param id supplier主键
     * @return 结果
     */
    @Override
    public int deleteBizSupplierById(Long id)
    {
        return bizSupplierMapper.deleteBizSupplierById(id);
    }
}
