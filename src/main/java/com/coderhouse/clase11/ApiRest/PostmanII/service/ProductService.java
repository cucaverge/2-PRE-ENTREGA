package com.coderhouse.clase11.ApiRest.PostmanII.service;

import com.coderhouse.clase11.ApiRest.PostmanII.model.Product;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product postProduct(Product product) throws Exception {
        return productRepository.save(product);
    }


    }
