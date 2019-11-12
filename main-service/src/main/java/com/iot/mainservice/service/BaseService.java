package com.iot.mainservice.service;

import com.iot.mainservice.entity.LabelType;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<T> {
    <S extends T> Page<S> findAll(Example<S> example, Pageable pageable);
    List<T> findAllByOrgId(Integer orgId);
    T save(T t);
    void deleteById(Integer id);
}
