package com.iot.mainservice.service;

import com.iot.mainservice.entity.Store;

import java.util.List;

public interface StoreService {
    List<Store> findAllByOrgId(Integer orgId);
    Store save(Store store);
    void deleteById(Integer storeId);
}
