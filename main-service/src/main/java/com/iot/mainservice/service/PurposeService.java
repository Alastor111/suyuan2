package com.iot.mainservice.service;

import com.iot.mainservice.entity.Purpose;

import java.util.List;
import java.util.Optional;

public interface PurposeService {
    Optional<Purpose> findById(Integer id);
    List<Purpose> findAllByOrgId(Integer orgId);
    Purpose save(Purpose purpose);
    void deleteById(Integer purposeId);
}
