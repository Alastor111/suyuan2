package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Org;
import com.iot.mainservice.repository.OrgRepository;
import com.iot.mainservice.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class OrgServiceImpl implements OrgService {
    private OrgRepository orgRepository;
    @Autowired
    public OrgServiceImpl(OrgRepository orgRepository) {
        this.orgRepository = orgRepository;
    }

    @Override
    public Optional<Org> findById(Integer integer) {
        return orgRepository.findById(integer);
    }

    @Override
    public Org save(Org org) {
        return orgRepository.save(org);
    }
}
