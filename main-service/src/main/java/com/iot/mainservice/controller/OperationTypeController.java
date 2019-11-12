package com.iot.mainservice.controller;


import com.iot.mainservice.entity.OperationType;
import com.iot.mainservice.service.OperationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operationtypes")
public class OperationTypeController {


    private final OperationTypeService operationTypeService;
    @Autowired
    public OperationTypeController(OperationTypeService operationTypeService) {
        this.operationTypeService = operationTypeService;
    }
    @GetMapping("/{orgId}")
    public List<OperationType> findAllByOrgId(@PathVariable Integer orgId){
        return operationTypeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public OperationType save(@RequestBody OperationType operationType){
        return operationTypeService.save(operationType);
    }
    @DeleteMapping("/{operationTypeId}")
    public void deleteById(@PathVariable Integer operationTypeId) {
        operationTypeService.deleteById(operationTypeId);
    }
    @PutMapping("/")
    public OperationType modify(@RequestBody OperationType operationType){
        return operationTypeService.save(operationType);
    }
}
