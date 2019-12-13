package com.iot.mainservice.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.mainservice.entity.Qualityinspection;
import com.iot.mainservice.service.QualityinspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public Qualityinspection save(@RequestParam("file") MultipartFile file,@RequestParam("file2") MultipartFile file2, String json){
        Qualityinspection qualityinspection;
        Qualityinspection qualityinspection1 = null;
        try {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(fileName));
            String fileName2 = file2.getOriginalFilename();
            file2.transferTo(new File(fileName2));
            qualityinspection = new ObjectMapper().readValue(json,Qualityinspection.class);
            //TODO 放到服务器上可以取消注释
            qualityinspection.setImgUrl(fileName);
            qualityinspection.setCardUrl(fileName2);
            qualityinspection1 = qualityinspectionService.save(qualityinspection);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return qualityinspection1;
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
