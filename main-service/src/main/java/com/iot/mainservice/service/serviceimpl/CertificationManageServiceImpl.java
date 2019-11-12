package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.CertificationManage;
import com.iot.mainservice.repository.CertificationManageRepository;
import com.iot.mainservice.service.CertificationManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CertificationManageServiceImpl implements CertificationManageService {

    private final CertificationManageRepository certificationManageRepository;

    @Autowired
    public CertificationManageServiceImpl(CertificationManageRepository certificationManageRepository) {
        this.certificationManageRepository = certificationManageRepository;
    }

    public List<CertificationManage> findAllByOrgId(Integer orgId){
        return certificationManageRepository.findAllByOrgId(orgId);
    }

    @Override
    public CertificationManage save(CertificationManage certificationManage) {
        return certificationManageRepository.save(certificationManage);
    }

    @Override
    public void deleteById(Integer certificationManageId) {
        certificationManageRepository.deleteById(certificationManageId);
    }
}

