package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Productplan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductplanRepository extends JpaRepository<Productplan, Integer> {

    List<Productplan> findAllByBatchId(Integer batchId);

}
