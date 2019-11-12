package com.iot.mainservice.service;

import com.iot.mainservice.entity.Org;

import java.util.Optional;

public interface OrgService {
    Optional<Org> findById(Integer integer);
    Org save(Org org);
}
