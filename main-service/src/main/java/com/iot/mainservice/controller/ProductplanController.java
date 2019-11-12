package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Productplan;
import com.iot.mainservice.service.ProductplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productplans")
public class ProductplanController {


    private final ProductplanService productplanService;
    @Autowired
    public ProductplanController(ProductplanService productplanService) {
        this.productplanService = productplanService;
    }
    @GetMapping("/{batchId}")
    public List<Productplan> findAllByOrgId(@PathVariable Integer batchId){
        return productplanService.findAllByBatchId(batchId);
    }
    @PostMapping("/")
    public Productplan save(@RequestBody Productplan productplan){
        return productplanService.save(productplan);
    }
    @DeleteMapping("/{productplanId}")
    public void deleteById(@PathVariable Integer productplanId) {
        productplanService.deleteById(productplanId);
    }
    @PutMapping("/")
    public Productplan modify(@RequestBody Productplan productplan){
        return productplanService.save(productplan);
    }
}
