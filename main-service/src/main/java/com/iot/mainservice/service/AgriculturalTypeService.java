package com.iot.mainservice.service;

import com.iot.mainservice.entity.AgriculturalType;

import java.util.List;

public interface AgriculturalTypeService {
    List<AgriculturalType> findAllByOrgId(Integer orgId);
    AgriculturalType save(AgriculturalType agriculturalType);
    void deleteById(Integer agriculturalTypeId);
}
