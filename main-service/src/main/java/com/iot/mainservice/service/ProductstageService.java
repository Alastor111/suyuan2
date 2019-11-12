package com.iot.mainservice.service;

import com.iot.mainservice.entity.Productstage;

import java.util.List;

public interface ProductstageService {
    List<Productstage> findAllByBatchId(Integer batchId);
    Productstage save(Productstage product);
    void deleteById(Integer productstageId);
}
