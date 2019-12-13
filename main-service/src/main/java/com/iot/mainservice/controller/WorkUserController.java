package com.iot.mainservice.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.mainservice.entity.WorkUser;
import com.iot.mainservice.service.WorkUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public WorkUser save (@RequestParam("file") MultipartFile file, String json) {
        WorkUser workUser;
        WorkUser workUser1 = null;
        try {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(fileName));
            workUser = new ObjectMapper().readValue(json,WorkUser.class);
            //TODO 放到服务器上可以取消注释
            workUser.setImgurl(fileName);
            workUser1 = workUserService.save(workUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workUser1;
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
