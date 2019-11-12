package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.WorkGroup;
import com.iot.mainservice.repository.WorkGroupRepository;
import com.iot.mainservice.service.WorkGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkGroupServiceImpl implements WorkGroupService {

    private final WorkGroupRepository workGroupRepository;

    @Autowired
    public WorkGroupServiceImpl(WorkGroupRepository workGroupRepository) {
        this.workGroupRepository = workGroupRepository;
    }

    public List<WorkGroup> findAllByOrgId(Integer orgId){
        return workGroupRepository.findAllByOrgId(orgId);
    }

    @Override
    public WorkGroup save(WorkGroup workGroup) {
        return workGroupRepository.save(workGroup);
    }

    @Override
    public void deleteById(Integer workGroupId) {
        workGroupRepository.deleteById(workGroupId);
    }
}

