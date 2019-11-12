package com.iot.mainservice.service;

import com.iot.mainservice.entity.WorkGroup;

import java.util.List;

public interface WorkGroupService {
    List<WorkGroup> findAllByOrgId(Integer orgId);
    WorkGroup save(WorkGroup workGroup);
    void deleteById(Integer workGroupId);
}
