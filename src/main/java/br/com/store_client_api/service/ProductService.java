package br.com.store_client_api.service;

import br.com.store_client_api.model.Products;
import br.com.store_client_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void insert(Products products){
        productRepository.save(products);
    }

    public void select(Products products) { productRepository.save(products); }

    public List<Products> findAll(){
        return productRepository.findAll();
    }
}
