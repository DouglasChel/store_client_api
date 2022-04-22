package br.com.store_client_api.service;
import br.com.store_client_api.model.Client;
import br.com.store_client_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void insert(Client client){ clientRepository.save(client);}

    public void select(Client client){ clientRepository.save(client); }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
}

