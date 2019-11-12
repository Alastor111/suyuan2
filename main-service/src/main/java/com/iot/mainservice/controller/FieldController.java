package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Field;
import com.iot.mainservice.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fields")
public class FieldController {


    private final FieldService fieldService;
    @Autowired
    public FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }
    @GetMapping("/{orgId}")
    public List<Field> findAllByOrgId(@PathVariable Integer orgId){
        return fieldService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Field save(@RequestBody Field field){
        return fieldService.save(field);
    }
    @DeleteMapping("/{fieldId}")
    public void deleteById(@PathVariable Integer fieldId) {
        fieldService.deleteById(fieldId);
    }
    @PutMapping("/")
    public Field modify(@RequestBody Field field){
        return fieldService.save(field);
    }
}
