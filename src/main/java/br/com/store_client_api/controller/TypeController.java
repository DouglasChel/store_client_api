package br.com.store_client_api.controller;

import br.com.store_client_api.constant.Constant;
import br.com.store_client_api.model.Type;
import br.com.store_client_api.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TypeController {
    @Autowired
    private TypeService typeService;

    @PostMapping(Constant.URL_TYPE)
    public void insert (@RequestBody Type type){ typeService.insert(type); }

    public void select (@RequestBody Type type){ typeService.select(type); }

    @GetMapping(Constant.URL_TYPE)
    public List<Type> findAll(){
        return typeService.findAll();
    }
}
