package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Retrospect;
import com.iot.mainservice.service.RetrospectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retrospects")
public class RetrospectController {


    private final RetrospectService retrospectService;
    @Autowired
    public RetrospectController(RetrospectService retrospectService) {
        this.retrospectService = retrospectService;
    }
    @GetMapping("/{orgId}")
    public List<Retrospect> findAllByOrgId(@PathVariable Integer orgId){
        return retrospectService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Retrospect save(@RequestBody Retrospect retrospect){
        return retrospectService.save(retrospect);
    }
    @DeleteMapping("/{retrospectId}")
    public void deleteById(@PathVariable Integer retrospectId) {
        retrospectService.deleteById(retrospectId);
    }
    @PutMapping("/")
    public Retrospect modify(@RequestBody Retrospect retrospect){
        return retrospectService.save(retrospect);
    }
}
