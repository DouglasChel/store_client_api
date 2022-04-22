package br.com.store_client_api.service;

import br.com.store_client_api.model.Sales;
import br.com.store_client_api.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public void insert(Sales sales){
        saleRepository.save(sales);
    }

    public void select(Sales sales){ saleRepository.save(sales); }

    public List<Sales> findAll(){
        return saleRepository.findAll();
    }
}