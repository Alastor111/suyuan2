package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Factory;
import com.iot.mainservice.entity.Field;
import com.iot.mainservice.repository.FactoryRepository;
import com.iot.mainservice.repository.FieldRepository;
import com.iot.mainservice.service.FactoryService;
import com.iot.mainservice.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FieldServiceImpl implements FieldService {

    private final FieldRepository fieldRepository;

    @Autowired
    public FieldServiceImpl(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public List<Field> findAllByOrgId(Integer orgId){
        return fieldRepository.findAllByOrgId(orgId);
    }

    @Override
    public Field save(Field field) {
        return fieldRepository.save(field);
    }

    @Override
    public void deleteById(Integer fieldId) {
        fieldRepository.deleteById(fieldId);
    }
}

