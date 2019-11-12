package com.iot.mainservice.repository;

import com.iot.mainservice.entity.QualityStandardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualityStandardTypeRepository extends JpaRepository<QualityStandardType,Integer> {
    List<QualityStandardType> findAllByFieldAndObject(String field,String object);
}
