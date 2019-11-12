package com.iot.mainservice.repository;

import com.iot.mainservice.entity.WorkGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkGroupRepository extends JpaRepository<WorkGroup,Integer> {
    List<WorkGroup> findAllByOrgId(Integer org_id);
}
