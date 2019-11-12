package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Store;
import com.iot.mainservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {


    private final StoreService storeService;
    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/{orgId}")
    public List<Store> findAllByOrgId(@PathVariable Integer orgId){
        return storeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Store save(@RequestBody Store store){
        return storeService.save(store);
    }
    @DeleteMapping("/{storeId}")
    public void deleteById(@PathVariable Integer storeId) {
        storeService.deleteById(storeId);
    }
    @PutMapping("/")
    public Store modify(@RequestBody Store store){
        return storeService.save(store);
    }
}
