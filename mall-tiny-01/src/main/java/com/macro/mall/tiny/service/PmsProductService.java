package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.mbg.model.PmsProduct;

import java.util.List;

public interface PmsProductService {
    List<PmsProduct> listAllProduct();
    PmsProduct getProduct(Long id);
}
