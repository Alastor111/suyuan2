package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Supplier;
import com.iot.mainservice.repository.SupplierRepository;
import com.iot.mainservice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> findAllByOrgId(Integer orgId){
        return supplierRepository.findAllByOrgId(orgId);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public void deleteById(Integer supplierId) {
        supplierRepository.deleteById(supplierId);
    }
}

