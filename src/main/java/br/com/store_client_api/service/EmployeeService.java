package br.com.store_client_api.service;

import br.com.store_client_api.model.Employee;
import br.com.store_client_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void insert(Employee employee){
        employeeRepository.save(employee);
    }

    public void select(Employee employee) { employeeRepository.save(employee); }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
