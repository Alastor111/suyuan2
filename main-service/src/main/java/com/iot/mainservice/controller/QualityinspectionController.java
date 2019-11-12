package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Qualityinspection;
import com.iot.mainservice.service.QualityinspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qualityinspections")
public class QualityinspectionController {


    private final QualityinspectionService qualityinspectionService;
    @Autowired
    public QualityinspectionController(QualityinspectionService qualityinspectionService) {
        this.qualityinspectionService = qualityinspectionService;
    }
    @GetMapping("/{orgId}")
    public List<Qualityinspection> findAllByOrgId(@PathVariable Integer orgId){
        return qualityinspectionService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Qualityinspection save(@RequestBody Qualityinspection qualityinspection){
        return qualityinspectionService.save(qualityinspection);
    }
    @DeleteMapping("/{qualityinspectionId}")
    public void deleteById(@PathVariable Integer qualityinspectionId) {
        qualityinspectionService.deleteById(qualityinspectionId);
    }
    @PutMapping("/")
    public Qualityinspection modify(@RequestBody Qualityinspection qualityinspection){
        return qualityinspectionService.save(qualityinspection);
    }
}
