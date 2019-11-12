package com.iot.mainservice.controller;


import com.iot.mainservice.entity.ProductType;
import com.iot.mainservice.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producttypes")
public class ProductTypeController {


    private final ProductTypeService productTypeService;
    @Autowired
    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }
    @GetMapping("/{orgId}")
    public List<ProductType> findAllByOrgId(@PathVariable Integer orgId){
        return productTypeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public ProductType save(@RequestBody ProductType productType){
        return productTypeService.save(productType);
    }
    @DeleteMapping("/{productTypeId}")
    public void deleteById(@PathVariable Integer productTypeId) {
        productTypeService.deleteById(productTypeId);
    }
    @PutMapping("/")
    public ProductType modify(@RequestBody ProductType productType){
        return productTypeService.save(productType);
    }
}
