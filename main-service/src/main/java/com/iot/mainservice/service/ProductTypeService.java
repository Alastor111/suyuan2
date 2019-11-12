package com.iot.mainservice.service;

import com.iot.mainservice.entity.ProductType;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAllByOrgId(Integer orgId);
    ProductType save(ProductType productType);
    void deleteById(Integer productTypeId);
}
