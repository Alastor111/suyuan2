package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Purpose;
import com.iot.mainservice.service.PurposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purposes")
public class PurposeController {


    private final PurposeService purposeService;
    @Autowired
    public PurposeController(PurposeService purposeService) {
        this.purposeService = purposeService;
    }
    @GetMapping("/{orgId}")
    public List<Purpose> findAllByOrgId(@PathVariable Integer orgId){
        return purposeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Purpose save(@RequestBody Purpose purpose){
        return purposeService.save(purpose);
    }
    @DeleteMapping("/{purposeId}")
    public void deleteById(@PathVariable Integer purposeId) {
        purposeService.deleteById(purposeId);
    }
    @PutMapping("/")
    public Purpose modify(@RequestBody Purpose purpose){
        return purposeService.save(purpose);
    }
}
