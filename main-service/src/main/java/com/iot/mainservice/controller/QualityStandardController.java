package com.iot.mainservice.controller;


import com.iot.mainservice.entity.QualityStandard;
import com.iot.mainservice.service.QualityStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qualitystandards")
public class QualityStandardController {


    private final QualityStandardService qualityStandardService;
    @Autowired
    public QualityStandardController(QualityStandardService qualityStandardService) {
        this.qualityStandardService = qualityStandardService;
    }
    @GetMapping("/{orgId}")
    public List<QualityStandard> findAllByOrgId(@PathVariable Integer orgId){
        return qualityStandardService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public QualityStandard save(@RequestBody QualityStandard qualityStandard){
        return qualityStandardService.save(qualityStandard);
    }
    @DeleteMapping("/{qualityStandardId}")
    public void deleteById(@PathVariable Integer qualityStandardId) {
        qualityStandardService.deleteById(qualityStandardId);
    }
    @PutMapping("/")
    public QualityStandard modify(@RequestBody QualityStandard qualityStandard){
        return qualityStandardService.save(qualityStandard);
    }
}
