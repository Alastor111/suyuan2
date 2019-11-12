package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.QualityStandardType;
import com.iot.mainservice.repository.QualityStandardTypeRepository;
import com.iot.mainservice.service.QualityStandardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QualityStandardTypeServiceImpl implements QualityStandardTypeService {

    private final QualityStandardTypeRepository qualityStandardTypeRepository;

    @Autowired
    public QualityStandardTypeServiceImpl(QualityStandardTypeRepository qualityStandardTypeRepository) {
        this.qualityStandardTypeRepository = qualityStandardTypeRepository;
    }

    public List<QualityStandardType> findAllByFieldAndObject(String field,String object){
        return qualityStandardTypeRepository.findAllByFieldAndObject(field,object);
    }

    @Override
    public QualityStandardType save(QualityStandardType qualityStandardType) {
        return qualityStandardTypeRepository.save(qualityStandardType);
    }

    @Override
    public void deleteById(Integer qualityStandardTypeId) {
        qualityStandardTypeRepository.deleteById(qualityStandardTypeId);
    }
}

