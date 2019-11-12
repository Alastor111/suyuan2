package com.iot.mainservice.service;

import com.iot.mainservice.entity.Qualityinspection;

import java.util.List;

public interface QualityinspectionService {
    List<Qualityinspection> findAllByOrgId(Integer orgId);
    Qualityinspection save(Qualityinspection qualityinspection);
    void deleteById(Integer qualityinspectionId);
}
