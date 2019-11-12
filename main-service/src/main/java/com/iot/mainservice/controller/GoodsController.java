package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Goods;
import com.iot.mainservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {


    private final GoodsService goodsService;
    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
    @GetMapping("/{orgId}")
    public List<Goods> findAllByOrgId(@PathVariable Integer orgId){
        return goodsService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Goods save(@RequestBody Goods goods){
        return goodsService.save(goods);
    }
    @DeleteMapping("/{goodsId}")
    public void deleteById(@PathVariable Integer goodsId) {
        goodsService.deleteById(goodsId);
    }
    @PutMapping("/")
    public Goods modify(@RequestBody Goods goods){
        return goodsService.save(goods);
    }
}
