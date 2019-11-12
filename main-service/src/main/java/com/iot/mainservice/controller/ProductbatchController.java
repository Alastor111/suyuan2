package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Productbatch;
import com.iot.mainservice.service.ProductbatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productbatchs")
public class ProductbatchController {


    private final ProductbatchService productbatchService;
    @Autowired
    public ProductbatchController(ProductbatchService productbatchService) {
        this.productbatchService = productbatchService;
    }
    @GetMapping("/{orgId}")
    public List<Productbatch> findAllByOrgId(@PathVariable Integer orgId){
        return productbatchService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Productbatch save(@RequestBody Productbatch productbatch){
        return productbatchService.save(productbatch);
    }
    @DeleteMapping("/{productbatchId}")
    public void deleteById(@PathVariable Integer productbatchId) {
        productbatchService.deleteById(productbatchId);
    }
    @PutMapping("/")
    public Productbatch modify(@RequestBody Productbatch productbatch){
        return productbatchService.save(productbatch);
    }
}
