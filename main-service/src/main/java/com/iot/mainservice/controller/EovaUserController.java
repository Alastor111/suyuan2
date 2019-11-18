package com.iot.mainservice.controller;

import com.iot.mainservice.entity2.EovaUser;
import com.iot.mainservice.service.EovaUserService;
import com.iot.mainservice.util.EncryptUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class EovaUserController {
    @Autowired
    private EovaUserService service;

    @GetMapping
    public EovaUser findByloginIdAndloginPwd(@RequestParam String loginId,@RequestParam String loginPwd){
        String pwd = EncryptUtil.getSM32(loginPwd);


        EovaUser eovaUser = service.findByLoginIdAndPwd(loginId, pwd);
        if( eovaUser != null){
            eovaUser.setLoginPwd(loginPwd);
            return eovaUser;
        }

        return null;
    }
    @GetMapping("/{id}")
    public EovaUser findById(@PathVariable Integer id){
        Optional<EovaUser> eovaUser = service.findById(id);
        if(eovaUser.isPresent()){
            return service.findById(id).get();
        }
        return null;
    }
}
