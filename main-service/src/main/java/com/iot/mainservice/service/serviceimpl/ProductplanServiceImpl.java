package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Productplan;
import com.iot.mainservice.repository.ProductplanRepository;
import com.iot.mainservice.service.ProductplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductplanServiceImpl implements ProductplanService {

    private final ProductplanRepository productplanRepository;

    @Autowired
    public ProductplanServiceImpl(ProductplanRepository productplanRepository) {
        this.productplanRepository = productplanRepository;
    }

    public List<Productplan> findAllByBatchId(Integer batchId){
        return productplanRepository.findAllByBatchId(batchId);
    }

    @Override
    public Productplan save(Productplan productplan) {
        return productplanRepository.save(productplan);
    }

    @Override
    public void deleteById(Integer productplanId) {
        productplanRepository.deleteById(productplanId);
    }
}

