package com.iot.mainservice.controller;

import com.iot.mainservice.entity.Farm;
import com.iot.mainservice.entity.LabelType;
import com.iot.mainservice.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farms")
public class FarmController {

    private final FarmService farmService;

    @Autowired
    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @GetMapping("/{orgId}")
    public List<Farm> findAllByOrgId(@PathVariable Integer orgId,@RequestParam Integer index,@RequestParam Integer size){

//        return farmService.findAllByOrgId(orgId);
        Farm farm = new Farm();
        farm.setOrgId(orgId);
        ///PageRequest继承于AbstractPageRequest并且实现了Pageable
        ///Sort.Direction是个枚举有ASC(升序)和DESC(降序)
        Sort.Direction sort =  Sort.Direction.ASC;
        ///获取PageRequest对象 index:页码 从0开始  size每页容量 sort排序方式 "id"->properties 以谁为准排序
        Pageable pageable = PageRequest.of(index, size, sort, "id");
        ///定义匹配规则 匹配"vendorId"这个属性 exact 精准匹配
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("vendorId",ExampleMatcher.GenericPropertyMatchers.exact());
        Example<Farm> example = Example.of(farm,exampleMatcher);
        Page<Farm> page = farmService.findAll(example,pageable);
        return page.getContent();
    }
    @PostMapping("/")
    public Farm save(@RequestBody Farm farm){
        return farmService.save(farm);
    }
    @DeleteMapping("/{farmId}")
    public void deleteById(@PathVariable Integer farmId) {
        farmService.deleteById(farmId);
    }
    @PutMapping("/")
    public Farm modify(@RequestBody Farm farm){
        return farmService.save(farm);
    }
}
