package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Farm;
import com.iot.mainservice.entity.LabelType;
import com.iot.mainservice.repository.FarmRepository;
import com.iot.mainservice.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FarmServiceImpl implements FarmService {

    private final FarmRepository farmRepository;

    @Autowired
    public FarmServiceImpl(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    @Override
    public <S extends Farm> Page<S> findAll(Example<S> example, Pageable pageable) {
        return farmRepository.findAll(example,pageable);
    }

    @Override
    public List<Farm> findAllByOrgId(Integer orgId) {
        return farmRepository.findAllByOrgId(orgId);
    }

    @Override
    public Farm save(Farm farm) {
        return farmRepository.save(farm);
    }
    @Override
    public void deleteById(Integer farmId) {
        farmRepository.deleteById(farmId);
    }
}
