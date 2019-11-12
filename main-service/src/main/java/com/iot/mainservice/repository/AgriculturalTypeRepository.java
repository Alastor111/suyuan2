package com.iot.mainservice.repository;

import com.iot.mainservice.entity.AgriculturalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AgriculturalTypeRepository extends JpaRepository<AgriculturalType, Integer> {

    List<AgriculturalType> findAllByOrgId(Integer orgId);

}
