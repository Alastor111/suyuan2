package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Product;
import com.iot.mainservice.repository.ProductRepository;
import com.iot.mainservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllByOrgId(Integer orgId){
        return productRepository.findAllByOrgId(orgId);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Integer productId) {
        productRepository.deleteById(productId);
    }
}

