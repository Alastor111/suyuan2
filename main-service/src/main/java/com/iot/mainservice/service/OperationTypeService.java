package com.iot.mainservice.service;

import com.iot.mainservice.entity.OperationType;

import java.util.List;

public interface OperationTypeService {
    List<OperationType> findAllByOrgId(Integer orgId);
    OperationType save(OperationType operationType);
    void deleteById(Integer operationTypeId);
}
