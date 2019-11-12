package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Goods;
import com.iot.mainservice.repository.GoodsRepository;
import com.iot.mainservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoodsServiceImpl implements GoodsService {

    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    public List<Goods> findAllByOrgId(Integer orgId){
        return goodsRepository.findAllByOrgId(orgId);
    }

    @Override
    public Goods save(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public void deleteById(Integer goodsId) {
        goodsRepository.deleteById(goodsId);
    }
}

