package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.OperationType;
import com.iot.mainservice.repository.OperationTypeRepository;
import com.iot.mainservice.service.OperationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OperationTypeServiceImpl implements OperationTypeService {

    private final OperationTypeRepository operationTypeRepository;

    @Autowired
    public OperationTypeServiceImpl(OperationTypeRepository operationTypeRepository) {
        this.operationTypeRepository = operationTypeRepository;
    }

    public List<OperationType> findAllByOrgId(Integer orgId){
        return operationTypeRepository.findAllByOrgId(orgId);
    }

    @Override
    public OperationType save(OperationType operationType) {
        return operationTypeRepository.save(operationType);
    }

    @Override
    public void deleteById(Integer operationTypeId) {
        operationTypeRepository.deleteById(operationTypeId);
    }
}

