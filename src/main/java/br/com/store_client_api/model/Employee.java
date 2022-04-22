package br.com.store_client_api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee extends Person {
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Double salary) {
        this.salary = salary;
    }
    public Employee(){}
}



