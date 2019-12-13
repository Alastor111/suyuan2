package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Purpose;
import com.iot.mainservice.repository.PurposeRepository;
import com.iot.mainservice.service.PurposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PurposeServiceImpl implements PurposeService {

    private final PurposeRepository purposeRepository;

    @Autowired
    public PurposeServiceImpl(PurposeRepository purposeRepository) {
        this.purposeRepository = purposeRepository;
    }

    @Override
    public Optional<Purpose> findById(Integer id) {
        return purposeRepository.findById(id);
    }

    public List<Purpose> findAllByOrgId(Integer orgId){
        return purposeRepository.findAllByOrgId(orgId);
    }

    @Override
    public Purpose save(Purpose purpose) {
        return purposeRepository.save(purpose);
    }

    @Override
    public void deleteById(Integer purposeId) {
        purposeRepository.deleteById(purposeId);
    }
}

