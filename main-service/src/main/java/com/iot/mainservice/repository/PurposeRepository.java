package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PurposeRepository extends JpaRepository<Purpose, Integer> {

    List<Purpose> findAllByOrgId(Integer orgId);

}
