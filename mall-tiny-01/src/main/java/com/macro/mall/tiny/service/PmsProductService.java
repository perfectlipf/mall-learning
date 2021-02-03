package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.mbg.model.PmsProduct;

import java.util.List;

public interface PmsProductService {

    List<PmsProduct> listAllProduct();

    PmsProduct getProduct(Long id);

    int createProduct(PmsProduct product);

    int updateProduct(Long id, PmsProduct product);

    int deleteProduct(Long id);

    List<PmsProduct> listProduct(int pageNum, int pageSize);

}
