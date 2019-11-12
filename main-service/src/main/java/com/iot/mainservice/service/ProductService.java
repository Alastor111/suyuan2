package com.iot.mainservice.service;

import com.iot.mainservice.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllByOrgId(Integer orgId);
    Product save(Product product);
    void deleteById(Integer productId);
}
