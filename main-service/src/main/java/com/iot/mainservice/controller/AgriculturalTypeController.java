package com.iot.mainservice.controller;


import com.iot.mainservice.entity.AgriculturalType;
import com.iot.mainservice.service.AgriculturalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agriculturaltypes")
public class AgriculturalTypeController {


    private final AgriculturalTypeService agriculturalTypeService;
    @Autowired
    public AgriculturalTypeController(AgriculturalTypeService agriculturalTypeService) {
        this.agriculturalTypeService = agriculturalTypeService;
    }
    @GetMapping("/{orgId}")
    public List<AgriculturalType> findAllByOrgId(@PathVariable Integer orgId){
        return agriculturalTypeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public AgriculturalType save(@RequestBody AgriculturalType agriculturalType){
        return agriculturalTypeService.save(agriculturalType);
    }
    @DeleteMapping("/{agriculturalTypeId}")
    public void deleteById(@PathVariable Integer agriculturalTypeId) {
        agriculturalTypeService.deleteById(agriculturalTypeId);
    }
    @PutMapping("/")
    public AgriculturalType modify(@RequestBody AgriculturalType agriculturalType){
        return agriculturalTypeService.save(agriculturalType);
    }
}
