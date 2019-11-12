package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Retrospect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RetrospectRepository extends JpaRepository<Retrospect, Integer> {

    List<Retrospect> findAllByOrgId(Integer orgId);

}
