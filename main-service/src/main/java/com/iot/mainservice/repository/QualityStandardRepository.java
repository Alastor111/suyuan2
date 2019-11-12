package com.iot.mainservice.repository;

import com.iot.mainservice.entity.QualityStandard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualityStandardRepository extends JpaRepository<QualityStandard,Integer> {
    List<QualityStandard> findAllByOrgId(Integer org_id);
}
