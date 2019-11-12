package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {

    List<Goods> findAllByOrgId(Integer orgId);

}
