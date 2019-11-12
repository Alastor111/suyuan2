package com.iot.mainservice.controller;


import com.iot.mainservice.entity.CertificationManage;
import com.iot.mainservice.service.CertificationManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificationmanages")
public class CertificationManageController {
    
    private final CertificationManageService certificationManageService;
    @Autowired
    public CertificationManageController(CertificationManageService certificationManageService) {
        this.certificationManageService = certificationManageService;
    }
    @GetMapping("/{orgId}")
    public List<CertificationManage> findAllByOrgId(@PathVariable Integer orgId){
        return certificationManageService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public CertificationManage save(@RequestBody CertificationManage certificationManage){
        return certificationManageService.save(certificationManage);
    }
    @DeleteMapping("/{certificationManageId}")
    public void deleteById(@PathVariable Integer certificationManageId) {
        certificationManageService.deleteById(certificationManageId);
    }
    @PutMapping("/")
    public CertificationManage modify(@RequestBody CertificationManage certificationManage){
        return certificationManageService.save(certificationManage);
    }
}
