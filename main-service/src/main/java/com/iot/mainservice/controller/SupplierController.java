package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Supplier;
import com.iot.mainservice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {


    private final SupplierService supplierService;
    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }
    @GetMapping("/{orgId}")
    public List<Supplier> findAllByOrgId(@PathVariable Integer orgId){
        return supplierService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Supplier save(@RequestBody Supplier supplier){
        return supplierService.save(supplier);
    }
    @DeleteMapping("/{supplierId}")
    public void deleteById(@PathVariable Integer supplierId) {
        supplierService.deleteById(supplierId);
    }
    @PutMapping("/")
    public Supplier modify(@RequestBody Supplier supplier){
        return supplierService.save(supplier);
    }
}
