package com.iot.mainservice.repository;

import com.iot.mainservice.entity.WorkUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkUserRepository extends JpaRepository<WorkUser,Integer> {
    List<WorkUser> findAllByOrgId(Integer org_id);
}
