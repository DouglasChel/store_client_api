package br.com.store_client_api.controller;

import br.com.store_client_api.constant.Constant;
import br.com.store_client_api.model.Employee;
import br.com.store_client_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(Constant.URL_EMPLOYEE)
    public void insert (@RequestBody Employee employee){ employeeService.insert(employee); }

    public void select (@RequestBody Employee employee){ employeeService.select(employee); }

    @GetMapping(Constant.URL_EMPLOYEE)
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
