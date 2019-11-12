package com.iot.mainservice.repository;

import com.iot.mainservice.entity.CertificationManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificationManageRepository extends JpaRepository<CertificationManage,Integer> {
    List<CertificationManage> findAllByOrgId(Integer org_id);
}
