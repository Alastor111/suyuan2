package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.QualityStandard;
import com.iot.mainservice.repository.QualityStandardRepository;
import com.iot.mainservice.service.QualityStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QualityStandardServiceImpl implements QualityStandardService {

    private final QualityStandardRepository fualityStandardRepository;

    @Autowired
    public QualityStandardServiceImpl(QualityStandardRepository fualityStandardRepository) {
        this.fualityStandardRepository = fualityStandardRepository;
    }

    public List<QualityStandard> findAllByOrgId(Integer orgId){
        return fualityStandardRepository.findAllByOrgId(orgId);
    }


    @Override
    public QualityStandard save(QualityStandard fualityStandard) {
        return fualityStandardRepository.save(fualityStandard);
    }

    @Override
    public void deleteById(Integer fualityStandardId) {
        fualityStandardRepository.deleteById(fualityStandardId);
    }
}

