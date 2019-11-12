package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FactoryRepository extends JpaRepository<Factory, Integer> {

    List<Factory> findAllByOrgId(Integer orgId);

}
