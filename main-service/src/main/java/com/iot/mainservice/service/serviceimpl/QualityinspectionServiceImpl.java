package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Qualityinspection;
import com.iot.mainservice.repository.QualityinspectionRepository;
import com.iot.mainservice.service.QualityinspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QualityinspectionServiceImpl implements QualityinspectionService {

    private final QualityinspectionRepository qualityinspectionRepository;

    @Autowired
    public QualityinspectionServiceImpl(QualityinspectionRepository qualityinspectionRepository) {
        this.qualityinspectionRepository = qualityinspectionRepository;
    }

    public List<Qualityinspection> findAllByOrgId(Integer orgId){
        return qualityinspectionRepository.findAllByOrgId(orgId);
    }

    @Override
    public Qualityinspection save(Qualityinspection qualityinspection) {
        return qualityinspectionRepository.save(qualityinspection);
    }

    @Override
    public void deleteById(Integer qualityinspectionId) {
        qualityinspectionRepository.deleteById(qualityinspectionId);
    }
}

