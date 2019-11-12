package com.iot.mainservice.controller;

import com.iot.mainservice.entity.Org;
import com.iot.mainservice.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("orgs")
public class OrgController {

    private OrgService orgService;

    @Autowired
    public OrgController(OrgService orgService) {
        this.orgService = orgService;
    }
    @RequestMapping("/{id}")
    public Optional<Org> findById(@PathVariable Integer id){
        Optional<Org> orgOptional = orgService.findById(id);
        return orgOptional;
    }

    @PostMapping("/")
    public Org save(@RequestBody Org org){
        return orgService.save(org);
    }
}
