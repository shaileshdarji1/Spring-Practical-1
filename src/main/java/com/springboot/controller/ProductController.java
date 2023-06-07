package com.springboot.controller;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add_product")
    public String saveProduct(@RequestBody Product product){
        if(product!=null){
           productService.saveProduct(product);
            return "Product data is successfully added";
        }
        else
        {
            return "Something went wrong";
        }
    }
}
