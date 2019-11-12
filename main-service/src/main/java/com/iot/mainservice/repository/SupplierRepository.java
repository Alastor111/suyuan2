package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    List<Supplier> findAllByOrgId(Integer orgId);

}
