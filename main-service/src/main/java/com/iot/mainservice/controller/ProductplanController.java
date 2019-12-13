package com.iot.mainservice.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.mainservice.entity.Productplan;
import com.iot.mainservice.entity.Productplan;
import com.iot.mainservice.service.ProductplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public Productplan save(@RequestParam("file") MultipartFile file, String json){
        Productplan productplan;
        Productplan productplan1 = null;
        try {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(fileName));
            productplan = new ObjectMapper().readValue(json,Productplan.class);
            //TODO 放到服务器上可以取消注释
            productplan.setImg(fileName);
            productplan1 = productplanService.save(productplan);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productplan1;
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
