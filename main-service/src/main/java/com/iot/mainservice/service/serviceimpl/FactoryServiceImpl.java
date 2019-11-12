package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Factory;
import com.iot.mainservice.repository.FactoryRepository;
import com.iot.mainservice.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FactoryServiceImpl implements FactoryService {

    private final FactoryRepository factoryRepository;

    @Autowired
    public FactoryServiceImpl(FactoryRepository factoryRepository) {
        this.factoryRepository = factoryRepository;
    }

    public List<Factory> findAllByOrgId(Integer orgId){
        return factoryRepository.findAllByOrgId(orgId);
    }

    @Override
    public Factory save(Factory factory) {
        return factoryRepository.save(factory);
    }

    @Override
    public void deleteById(Integer factoryId) {
        factoryRepository.deleteById(factoryId);
    }
}

