package com.iot.mainservice.service;

import com.iot.mainservice.entity.Goods;

import java.util.List;
import java.util.Optional;

public interface GoodsService {
    Optional<Goods> findById(Integer id);
    List<Goods> findAllByOrgId(Integer orgId);
    Goods save(Goods goods);
    void deleteById(Integer goodsId);
}
