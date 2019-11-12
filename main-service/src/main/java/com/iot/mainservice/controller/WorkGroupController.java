package com.iot.mainservice.controller;


import com.iot.mainservice.entity.WorkGroup;
import com.iot.mainservice.service.WorkGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workgroups")
public class WorkGroupController {


    private final WorkGroupService workGroupService;
    @Autowired
    public WorkGroupController(WorkGroupService workGroupService) {
        this.workGroupService = workGroupService;
    }
    @GetMapping("/{orgId}")
    public List<WorkGroup> findAllByOrgId(@PathVariable Integer orgId){
        return workGroupService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public WorkGroup save(@RequestBody WorkGroup workGroup){
        return workGroupService.save(workGroup);
    }
    @DeleteMapping("/{workGroupId}")
    public void deleteById(@PathVariable Integer workGroupId) {
        workGroupService.deleteById(workGroupId);
    }
    @PutMapping("/")
    public WorkGroup modify(@RequestBody WorkGroup workGroup){
        return workGroupService.save(workGroup);
    }
}
