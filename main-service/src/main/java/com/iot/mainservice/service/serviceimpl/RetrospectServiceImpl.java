package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Retrospect;
import com.iot.mainservice.repository.RetrospectRepository;
import com.iot.mainservice.service.RetrospectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RetrospectServiceImpl implements RetrospectService {

    private final RetrospectRepository retrospectRepository;

    @Autowired
    public RetrospectServiceImpl(RetrospectRepository retrospectRepository) {
        this.retrospectRepository = retrospectRepository;
    }

    public List<Retrospect> findAllByOrgId(Integer orgId){
        return retrospectRepository.findAllByOrgId(orgId);
    }

    @Override
    public Retrospect save(Retrospect retrospect) {
        return retrospectRepository.save(retrospect);
    }

    @Override
    public void deleteById(Integer retrospectId) {
        retrospectRepository.deleteById(retrospectId);
    }
}

