package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.macro.mall.tiny.mbg.mapper.PmsProductMapper;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.mbg.model.PmsBrandExample;
import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.mbg.model.PmsProductExample;
import com.macro.mall.tiny.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductServiceImpl implements PmsProductService {
    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public List<PmsProduct> listAllProduct() {
        return productMapper.selectByExample(new PmsProductExample());
    }

    @Override
    public PmsProduct getProduct(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int createProduct(PmsProduct product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int updateProduct(Long id, PmsProduct product) {
        product.setId(id);
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public int deleteProduct(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsProduct> listProduct(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return productMapper.selectByExample(new PmsProductExample());
    }
}
