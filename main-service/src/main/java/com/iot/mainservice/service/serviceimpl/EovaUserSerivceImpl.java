package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity2.EovaUser;
import com.iot.mainservice.repository2.EovaUserRepo;
import com.iot.mainservice.service.EovaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EovaUserSerivceImpl implements EovaUserService {
    @Autowired
    private EovaUserRepo eovaUserRepo;
    @Override
    public EovaUser findByLoginIdAndPwd(String loginId,String loginPwd) {
        return eovaUserRepo.findByLoginIdAndLoginPwd(loginId,loginPwd);
    }

    @Override
    public Optional<EovaUser> findById(Integer id) {
        return eovaUserRepo.findById(id);
    }
}
