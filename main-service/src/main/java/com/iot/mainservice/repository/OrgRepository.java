package com.iot.mainservice.repository;

import com.iot.mainservice.entity.Org;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrgRepository extends JpaRepository<Org,Integer> {
    @Override
    Optional<Org> findById(Integer integer);
}
