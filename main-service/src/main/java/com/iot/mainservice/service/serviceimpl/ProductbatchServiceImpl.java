package com.iot.mainservice.service.serviceimpl;

import com.iot.mainservice.entity.Productbatch;
import com.iot.mainservice.repository.ProductbatchRepository;
import com.iot.mainservice.service.ProductbatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductbatchServiceImpl implements ProductbatchService {

    private final ProductbatchRepository productbatchRepository;

    @Autowired
    public ProductbatchServiceImpl(ProductbatchRepository productbatchRepository) {
        this.productbatchRepository = productbatchRepository;
    }

    public List<Productbatch> findAllByOrgId(Integer orgId){
        return productbatchRepository.findAllByOrgId(orgId);
    }

    @Override
    public Productbatch save(Productbatch productbatch) {
        return productbatchRepository.save(productbatch);
    }

    @Override
    public void deleteById(Integer productbatchId) {
        productbatchRepository.deleteById(productbatchId);
    }
}

