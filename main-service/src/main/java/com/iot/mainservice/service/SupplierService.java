package com.iot.mainservice.service;

import com.iot.mainservice.entity.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> findAllByOrgId(Integer orgId);
    Supplier save(Supplier supplier);
    void deleteById(Integer supplierId);
}
