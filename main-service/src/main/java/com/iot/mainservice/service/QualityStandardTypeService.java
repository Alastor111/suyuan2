package com.iot.mainservice.service;

import com.iot.mainservice.entity.QualityStandardType;

import java.util.List;

public interface QualityStandardTypeService {
    List<QualityStandardType> findAllByFieldAndObject(String field,String object);
    QualityStandardType save(QualityStandardType qualityStandardType);
    void deleteById(Integer qualityStandardTypeId);
}
