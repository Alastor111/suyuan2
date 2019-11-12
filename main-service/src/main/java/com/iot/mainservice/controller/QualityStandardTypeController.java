package com.iot.mainservice.controller;


import com.iot.mainservice.entity.QualityStandardType;
import com.iot.mainservice.service.QualityStandardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qualitystandardtypes")
public class QualityStandardTypeController {


    private final QualityStandardTypeService qualityStandardTypeService;
    @Autowired
    public QualityStandardTypeController(QualityStandardTypeService qualityStandardTypeService) {
        this.qualityStandardTypeService = qualityStandardTypeService;
    }
    @GetMapping("/")
    public List<QualityStandardType> findAll(){
        return qualityStandardTypeService.findAllByFieldAndObject("type","quality_standard");
    }
    @PostMapping("/")
    public QualityStandardType save(@RequestBody QualityStandardType qualityStandardType){
        return qualityStandardTypeService.save(qualityStandardType);
    }
    @DeleteMapping("/{qualityStandardTypeId}")
    public void deleteById(@PathVariable Integer qualityStandardTypeId) {
        qualityStandardTypeService.deleteById(qualityStandardTypeId);
    }
    @PutMapping("/")
    public QualityStandardType modify(@RequestBody QualityStandardType qualityStandardType){
        return qualityStandardTypeService.save(qualityStandardType);
    }
}
