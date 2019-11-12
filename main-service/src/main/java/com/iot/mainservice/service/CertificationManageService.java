package com.iot.mainservice.service;

import com.iot.mainservice.entity.CertificationManage;

import java.util.List;

public interface CertificationManageService {
    List<CertificationManage> findAllByOrgId(Integer orgId);
    CertificationManage save(CertificationManage certificationManage);
    void deleteById(Integer certificationManageId);
}
