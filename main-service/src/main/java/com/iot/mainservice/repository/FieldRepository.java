package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Factory;
import com.iot.mainservice.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FieldRepository extends JpaRepository<Field, Integer> {

    List<Field> findAllByOrgId(Integer orgId);

}
