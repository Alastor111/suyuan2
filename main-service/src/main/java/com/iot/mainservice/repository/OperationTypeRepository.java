package com.iot.mainservice.repository;

import com.iot.mainservice.entity.OperationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationTypeRepository extends JpaRepository<OperationType,Integer> {
    List<OperationType> findAllByOrgId(Integer org_id);
}
