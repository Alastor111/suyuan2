package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Farm;
import com.iot.mainservice.entity.LabelType;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FarmRepository extends JpaRepository<Farm,Integer> {
    List<Farm> findAllByOrgId(Integer org_id);

    @Override
    <S extends Farm> Page<S> findAll(Example<S> example, Pageable pageable);
}
