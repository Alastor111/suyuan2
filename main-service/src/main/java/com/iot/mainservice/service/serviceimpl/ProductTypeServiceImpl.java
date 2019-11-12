package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.ProductType;
import com.iot.mainservice.repository.ProductTypeRepository;
import com.iot.mainservice.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    private final ProductTypeRepository productTypeRepository;

    @Autowired
    public ProductTypeServiceImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    public List<ProductType> findAllByOrgId(Integer orgId){
        return productTypeRepository.findAllByOrgId(orgId);
    }

    @Override
    public ProductType save(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public void deleteById(Integer productTypeId) {
        productTypeRepository.deleteById(productTypeId);
    }
}

