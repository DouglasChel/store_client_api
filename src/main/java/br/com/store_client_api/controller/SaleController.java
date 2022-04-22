package br.com.store_client_api.controller;
;
import br.com.store_client_api.constant.Constant;
import br.com.store_client_api.model.Sales;
import br.com.store_client_api.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping(Constant.URL_SALE)
    public void insert (@RequestBody Sales sales){
        saleService.insert(sales);
    }

    public void select (@RequestBody Sales sales){ saleService.select(sales); }

    @GetMapping(Constant.URL_SALE)
    public List<Sales> findAll(){ return saleService.findAll(); }
}
