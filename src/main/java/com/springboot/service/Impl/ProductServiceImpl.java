package com.springboot.service.Impl;

import com.springboot.entity.Product;
import com.springboot.repository.ProductRepository;
import com.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
       productRepository.save(product);
    }
}
