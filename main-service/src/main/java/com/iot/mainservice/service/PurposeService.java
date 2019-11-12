package com.iot.mainservice.service;

import com.iot.mainservice.entity.Purpose;

import java.util.List;

public interface PurposeService {
    List<Purpose> findAllByOrgId(Integer orgId);
    Purpose save(Purpose purpose);
    void deleteById(Integer purposeId);
}
