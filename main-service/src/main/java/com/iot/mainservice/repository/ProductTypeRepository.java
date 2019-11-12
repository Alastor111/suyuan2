package com.iot.mainservice.repository;

import com.iot.mainservice.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
    List<ProductType> findAllByOrgId(Integer org_id);
}
