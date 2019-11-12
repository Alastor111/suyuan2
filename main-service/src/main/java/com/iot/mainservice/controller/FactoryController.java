package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Factory;
import com.iot.mainservice.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factorys")
public class FactoryController {


    private final FactoryService factoryService;
    @Autowired
    public FactoryController(FactoryService factoryService) {
        this.factoryService = factoryService;
    }
    @GetMapping("/{orgId}")
    public List<Factory> findAllByOrgId(@PathVariable Integer orgId){
        return factoryService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Factory save(@RequestBody Factory factory){
        return factoryService.save(factory);
    }
    @DeleteMapping("/{factoryId}")
    public void deleteById(@PathVariable Integer factoryId) {
        factoryService.deleteById(factoryId);
    }
    @PutMapping("/")
    public Factory modify(@RequestBody Factory factory){
        return factoryService.save(factory);
    }
}
