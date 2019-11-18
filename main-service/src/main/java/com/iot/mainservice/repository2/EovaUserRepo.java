package com.iot.mainservice.repository2;

import com.iot.mainservice.entity2.EovaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EovaUserRepo extends JpaRepository<EovaUser,Integer> {
    EovaUser findByLoginIdAndLoginPwd(String loginId,String loginPwd);
}
