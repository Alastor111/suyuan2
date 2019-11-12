package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.WorkUser;
import com.iot.mainservice.repository.WorkUserRepository;
import com.iot.mainservice.service.WorkUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkUserServiceImpl implements WorkUserService {

    private final WorkUserRepository workUserRepository;

    @Autowired
    public WorkUserServiceImpl(WorkUserRepository workUserRepository) {
        this.workUserRepository = workUserRepository;
    }

    public List<WorkUser> findAllByOrgId(Integer orgId){
        return workUserRepository.findAllByOrgId(orgId);
    }

    @Override
    public WorkUser save(WorkUser workUser) {
        return workUserRepository.save(workUser);
    }

    @Override
    public void deleteById(Integer workUserId) {
        workUserRepository.deleteById(workUserId);
    }
}

