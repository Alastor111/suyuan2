package com.iot.mainservice.service;

import com.iot.mainservice.entity.WorkUser;

import java.util.List;

public interface WorkUserService {
    List<WorkUser> findAllByOrgId(Integer orgId);
    WorkUser save(WorkUser workUser);
    void deleteById(Integer workUserId);
}
