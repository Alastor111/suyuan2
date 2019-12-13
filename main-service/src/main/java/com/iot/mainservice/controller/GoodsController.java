package com.iot.mainservice.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.mainservice.entity.Goods;
import com.iot.mainservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public Goods save(@RequestParam("file") MultipartFile file, String json){
        Goods goods;
        Goods goods1 = null;
        try {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(fileName));
            goods = new ObjectMapper().readValue(json,Goods.class);
            //TODO 放到服务器上可以取消注释
            goods.setImgurl(fileName);
            goods1 = goodsService.save(goods);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return goods1;
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
