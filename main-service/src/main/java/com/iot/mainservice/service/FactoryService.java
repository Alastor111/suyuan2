package com.iot.mainservice.service;

import com.iot.mainservice.entity.Factory;

import java.util.List;

public interface FactoryService {
    List<Factory> findAllByOrgId(Integer orgId);
    Factory save(Factory factory);
    void deleteById(Integer factoryId);
}
