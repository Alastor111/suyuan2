package com.iot.mainservice.controller;


import com.iot.mainservice.entity.WorkUser;
import com.iot.mainservice.service.WorkUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workusers")
public class WorkUserController {
    
    private final WorkUserService workUserService;
    @Autowired
    public WorkUserController(WorkUserService workUserService) {
        this.workUserService = workUserService;
    }
    @GetMapping("/{orgId}")
    public List<WorkUser> findAllByOrgId(@PathVariable Integer orgId){
        return workUserService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public WorkUser save(@RequestBody WorkUser workUser){
        return workUserService.save(workUser);
    }
    @DeleteMapping("/{workUserId}")
    public void deleteById(@PathVariable Integer workUserId) {
        workUserService.deleteById(workUserId);
    }
    @PutMapping("/")
    public WorkUser modify(@RequestBody WorkUser workUser){
        return workUserService.save(workUser);
    }
}
