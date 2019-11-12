package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Qualityinspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QualityinspectionRepository extends JpaRepository<Qualityinspection, Integer> {

    List<Qualityinspection> findAllByOrgId(Integer orgId);

}
