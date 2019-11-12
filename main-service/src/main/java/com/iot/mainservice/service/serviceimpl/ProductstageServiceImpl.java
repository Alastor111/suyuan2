package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Productstage;
import com.iot.mainservice.repository.ProductstageRepository;
import com.iot.mainservice.service.ProductstageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductstageServiceImpl implements ProductstageService {

    private final ProductstageRepository productstageRepository;

    @Autowired
    public ProductstageServiceImpl(ProductstageRepository productstageRepository) {
        this.productstageRepository = productstageRepository;
    }

    public List<Productstage> findAllByBatchId(Integer batchId){
        return productstageRepository.findAllByBatchId(batchId);
    }

    @Override
    public Productstage save(Productstage productstage) {
        return productstageRepository.save(productstage);
    }

    @Override
    public void deleteById(Integer productstageId) {
        productstageRepository.deleteById(productstageId);
    }
}

