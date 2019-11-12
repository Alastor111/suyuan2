package com.iot.mainservice.service;

import com.iot.mainservice.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAllByOrgId(Integer orgId);
    Goods save(Goods goods);
    void deleteById(Integer goodsId);
}
