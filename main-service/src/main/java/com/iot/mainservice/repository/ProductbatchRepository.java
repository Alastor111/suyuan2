package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Productbatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductbatchRepository extends JpaRepository<Productbatch, Integer> {

    List<Productbatch> findAllByOrgId(Integer orgId);

}
