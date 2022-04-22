package br.com.store_client_api.controller;

import br.com.store_client_api.model.Client;
import br.com.store_client_api.constant.Constant;
import br.com.store_client_api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.URL_CLIENT)
    public void insert (@RequestBody Client client){
        clientService.insert(client);
    }
    public void select (@RequestBody Client client){ clientService.select(client); }

    @GetMapping(Constant.URL_CLIENT)
    public List<Client> findAll(){
        return clientService.findAll();
    }

}
