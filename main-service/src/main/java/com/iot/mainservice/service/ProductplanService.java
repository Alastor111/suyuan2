package com.iot.mainservice.service;

import com.iot.mainservice.entity.Productplan;

import java.util.List;

public interface ProductplanService {
    List<Productplan> findAllByBatchId(Integer batchId);
    Productplan save(Productplan product);
    void deleteById(Integer productplanId);
}
