package com.iot.mainservice.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.mainservice.entity.Productstage;
import com.iot.mainservice.entity.Productstage;
import com.iot.mainservice.service.ProductstageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public Productstage save(@RequestParam("file") MultipartFile file, String json){
        Productstage productstage;
        Productstage productstage1 = null;
        try {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(fileName));
            productstage = new ObjectMapper().readValue(json,Productstage.class);
            //TODO 放到服务器上可以取消注释
            productstage.setImg(fileName);
            productstage1 = productstageService.save(productstage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productstage1;
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
