package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

    List<Store> findAllByOrgId(Integer orgId);

}
