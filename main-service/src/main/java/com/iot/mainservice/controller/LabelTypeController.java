package com.iot.mainservice.controller;


import com.iot.mainservice.entity.LabelType;
import com.iot.mainservice.service.LabelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labeltypes")
public class LabelTypeController {


    private final LabelTypeService labelTypeService;
    @Autowired
    public LabelTypeController(LabelTypeService labelTypeService) {
        this.labelTypeService = labelTypeService;
    }
//    @GetMapping("/{orgId}")
//    public Page<LabelType> findAllByOrgId(@PathVariable Integer orgId, @RequestParam int size, @RequestParam int index){
////        return labelTypeService.findAllByOrgId(orgId);
//        LabelType labelType = new LabelType();
//        labelType.setOrgId(orgId);
//        ///PageRequest继承于AbstractPageRequest并且实现了Pageable
//        ///Sort.Direction是个枚举有ASC(升序)和DESC(降序)
//        Sort.Direction sort =  Sort.Direction.ASC;
//        ///获取PageRequest对象 index:页码 从0开始  size每页容量 sort排序方式 "id"->properties 以谁为准排序
//        Pageable pageable = PageRequest.of(index, size, sort, "id");
//        ///定义匹配规则 匹配"vendorId"这个属性 exact 精准匹配
//        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("vendorId",ExampleMatcher.GenericPropertyMatchers.exact());
//        Example<LabelType> example = Example.of(labelType,exampleMatcher);
//        Page<LabelType> page = labelTypeService.findAll(example,pageable);
//        return page;
//    }
    @GetMapping("/{orgId}")
    public List<LabelType> findAllByOrgId(@PathVariable Integer orgId){
        return labelTypeService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public LabelType save(@RequestBody LabelType labelType){
        return labelTypeService.save(labelType);
    }
    @DeleteMapping("/{labelTypeId}")
    public void deleteById(@PathVariable Integer labelTypeId) {
        labelTypeService.deleteById(labelTypeId);
    }
    @PutMapping("/")
    public LabelType modify(@RequestBody LabelType labelType){
        return labelTypeService.save(labelType);
    }
}
