package com.iot.mainservice.controller;


import com.iot.mainservice.entity.Goods;
import com.iot.mainservice.entity.Purpose;
import com.iot.mainservice.service.GoodsService;
import com.iot.mainservice.service.PurposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purposes")
public class PurposeController {
    @Autowired
    private GoodsService goodsService;

    private final PurposeService purposeService;
    @Autowired
    public PurposeController(PurposeService purposeService) {
        this.purposeService = purposeService;
    }
    @GetMapping("/{orgId}")
    public List<Purpose> findAllByOrgId(@PathVariable Integer orgId){
        return purposeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Purpose save(@RequestBody Purpose purpose){
        Goods goods = purpose.getGoods();
        int state = purpose.getState();

        if(purpose.getId() != null){//修改
            Optional<Purpose> purpose1 = purposeService.findById(purpose.getId());
            Purpose oldPurpose = purpose1.get();
            int oldState = oldPurpose.getState();
            if(oldState == 0 && state == 1){
                goods.setNum(goods.getNum() + purpose.getUse_num() - purpose.getUsed_num());
                goodsService.save(goods);
            }
        }else {//新增
            if(state == 0){
                goods.setNum(goods.getNum() - purpose.getUse_num());
                goodsService.save(goods);
            }else{
                goods.setNum(goods.getNum() - purpose.getUsed_num());
                goodsService.save(goods);
            }
        }
        return purposeService.save(purpose);
    }
    @DeleteMapping("/{purposeId}")
    public void deleteById(@PathVariable Integer purposeId) {
        purposeService.deleteById(purposeId);
    }
    @PutMapping("/")
    public Purpose modify(@RequestBody Purpose purpose){
        return purposeService.save(purpose);
    }
}
