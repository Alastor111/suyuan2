package com.iot.mainservice.service;

import com.iot.mainservice.entity.Retrospect;

import java.util.List;

public interface RetrospectService {
    List<Retrospect> findAllByOrgId(Integer orgId);
    Retrospect save(Retrospect retrospect);
    void deleteById(Integer retrospectId);
}
