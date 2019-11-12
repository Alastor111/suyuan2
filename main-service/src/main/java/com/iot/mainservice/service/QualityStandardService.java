package com.iot.mainservice.service;

import com.iot.mainservice.entity.QualityStandard;

import java.util.List;

public interface QualityStandardService {
    List<QualityStandard> findAllByOrgId(Integer orgId);
    QualityStandard save(QualityStandard qualityStandard);
    void deleteById(Integer qualityStandardId);
}
