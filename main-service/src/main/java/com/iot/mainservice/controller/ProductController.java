package com.iot.mainservice.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.mainservice.entity.Product;
import com.iot.mainservice.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Value("spring.servlet.multipart.location")
    private String location;

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{orgId}")
    public List<Product> findAllByOrgId(@PathVariable Integer orgId){
        return productService.findAllByOrgId(orgId);
    }
    @PostMapping("/")
    public Product save (@RequestParam("file") MultipartFile file,String json) throws IOException {
        String fileName = file.getOriginalFilename();
        file.transferTo(new File(fileName));
        Product product;
        Product product1 = null;
        try {
            product = new ObjectMapper().readValue(json,Product.class);
            //TODO 放到服务器上可以取消注释
//            product.setImgurl(fileName);
             product1 = productService.save(product);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return product1;
    }
    @DeleteMapping("/{productId}")
    public void deleteById(@PathVariable Integer productId) {
        productService.deleteById(productId);
    }
    @PutMapping("/")
    public Product modify(@RequestBody Product product){
        return productService.save(product);
    }
}
