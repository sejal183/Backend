package com.example.academia.Academiaservice;


import com.example.academia.employee.Employee;
import com.example.academia.employee.Employeerepo;
import com.example.academia.salary.Salary;
import com.example.academia.salary.SalaryDTO;
import com.example.academia.salary.Salaryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final Salaryrepo salaryrepo;
    private final Employeerepo employeerepo;
    @Autowired
    public EmployeeService(Salaryrepo salaryrepo, Employeerepo employeerepo) {
        this.salaryrepo = salaryrepo;
        this.employeerepo = employeerepo;
    }
    public boolean login(Credentials credentials){
        Optional<Employee> temp=employeerepo.findByEmail(credentials.username);
        return temp.map(value -> value.getPassword().equals(credentials.password)).orElse(false);
    }
    public List<Salary> getSalaryDetails(SalaryDTO salaryDTO){
        Optional<Employee>emp=employeerepo.findById(salaryDTO.getEmployee_id());
        if(emp.isPresent()){
            return salaryrepo.findSalariesByEmployee(emp.get());
        }
        return new ArrayList<>();
    }

}
