package com.iot.mainservice.service;

import com.iot.mainservice.entity2.EovaUser;

import java.util.Optional;

public interface EovaUserService {
    EovaUser findByLoginIdAndPwd(String loginId,String loginPwd);
    Optional<EovaUser> findById(Integer id);
}
