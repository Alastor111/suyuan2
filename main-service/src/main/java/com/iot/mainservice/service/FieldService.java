package com.iot.mainservice.service;

import com.iot.mainservice.entity.Factory;
import com.iot.mainservice.entity.Field;

import java.util.List;

public interface FieldService {
    List<Field> findAllByOrgId(Integer orgId);
    Field save(Field field);
    void deleteById(Integer fieldId);
}
