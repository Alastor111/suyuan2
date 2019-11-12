package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Productstage;
import com.iot.mainservice.service.ProductstageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productstages")
public class ProductstageController {


    private final ProductstageService productstageService;
    @Autowired
    public ProductstageController(ProductstageService productstageService) {
        this.productstageService = productstageService;
    }
    @GetMapping("/{batchId}")
    public List<Productstage> findAllByOrgId(@PathVariable Integer batchId){
        return productstageService.findAllByBatchId(batchId);
    }
    @PostMapping("/")
    public Productstage save(@RequestBody Productstage productstage){
        return productstageService.save(productstage);
    }
    @DeleteMapping("/{productstageId}")
    public void deleteById(@PathVariable Integer productstageId) {
        productstageService.deleteById(productstageId);
    }
    @PutMapping("/")
    public Productstage modify(@RequestBody Productstage productstage){
        return productstageService.save(productstage);
    }
}
