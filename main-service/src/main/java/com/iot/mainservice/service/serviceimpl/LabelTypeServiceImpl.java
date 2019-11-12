package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.LabelType;
import com.iot.mainservice.repository.LabelTypeRepository;
import com.iot.mainservice.service.LabelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LabelTypeServiceImpl implements LabelTypeService {

    private final LabelTypeRepository labelTypeRepository;

    @Autowired
    public LabelTypeServiceImpl(LabelTypeRepository labelTypeRepository) {
        this.labelTypeRepository = labelTypeRepository;
    }


    @Override
    public <S extends LabelType> Page<S> findAll(Example<S> example, Pageable pageable) {
        return labelTypeRepository.findAll(example,pageable);
    }

    @Override
    public List<LabelType> findAllByOrgId(Integer orgId) {
        return labelTypeRepository.findAllByOrgId(orgId);
    }

    @Override
    public LabelType save(LabelType labelType) {
        return labelTypeRepository.save(labelType);
    }

    @Override
    public void deleteById(Integer labelTypeId) {
        labelTypeRepository.deleteById(labelTypeId);
    }
}
