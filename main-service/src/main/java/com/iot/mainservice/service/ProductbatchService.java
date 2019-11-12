package com.iot.mainservice.service;

import com.iot.mainservice.entity.Productbatch;

import java.util.List;

public interface ProductbatchService {
    List<Productbatch> findAllByOrgId(Integer orgId);
    Productbatch save(Productbatch product);
    void deleteById(Integer productbatchId);
}
