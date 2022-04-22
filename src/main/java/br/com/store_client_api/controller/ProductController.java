package br.com.store_client_api.controller;

import br.com.store_client_api.constant.Constant;
import br.com.store_client_api.model.Products;
import br.com.store_client_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(Constant.URL_PRODUCT)
    public void insert (@RequestBody Products products){
        productService.insert(products);
    }

    public void select (@RequestBody Products products){ productService.select(products); }

    @GetMapping(Constant.URL_PRODUCT)
    public List<Products> findAll(){
        return productService.findAll();
    }


}
