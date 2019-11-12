package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.AgriculturalType;
import com.iot.mainservice.repository.AgriculturalTypeRepository;
import com.iot.mainservice.service.AgriculturalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AgriculturalTypeServiceImpl implements AgriculturalTypeService {

    private final AgriculturalTypeRepository agriculturalTypeRepository;

    @Autowired
    public AgriculturalTypeServiceImpl(AgriculturalTypeRepository agriculturalTypeRepository) {
        this.agriculturalTypeRepository = agriculturalTypeRepository;
    }

    public List<AgriculturalType> findAllByOrgId(Integer orgId){
        return agriculturalTypeRepository.findAllByOrgId(orgId);
    }

    @Override
    public AgriculturalType save(AgriculturalType agriculturalType) {
        return agriculturalTypeRepository.save(agriculturalType);
    }

    @Override
    public void deleteById(Integer agriculturalTypeId) {
        agriculturalTypeRepository.deleteById(agriculturalTypeId);
    }
}

