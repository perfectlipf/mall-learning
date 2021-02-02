package com.macro.mall.tiny.service.impl;

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


}
