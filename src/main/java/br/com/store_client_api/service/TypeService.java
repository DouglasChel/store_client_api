package br.com.store_client_api.service;

import br.com.store_client_api.model.Type;
import br.com.store_client_api.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class TypeService {
    @Autowired
    private TypeRepository typeRepository;

    public void insert(Type type){ typeRepository.save(type); }

    public void select(Type type){ typeRepository.save(type); }

    public List<Type> findAll(){
        return typeRepository.findAll();
    }
}
