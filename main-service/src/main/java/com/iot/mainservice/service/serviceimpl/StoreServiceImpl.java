package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Store;
import com.iot.mainservice.repository.StoreRepository;
import com.iot.mainservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<Store> findAllByOrgId(Integer orgId){
        return storeRepository.findAllByOrgId(orgId);
    }

    @Override
    public Store save(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void deleteById(Integer storeId) {
        storeRepository.deleteById(storeId);
    }
}

