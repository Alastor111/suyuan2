package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Productstage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductstageRepository extends JpaRepository<Productstage, Integer> {

    List<Productstage> findAllByBatchId(Integer batchId);

}
