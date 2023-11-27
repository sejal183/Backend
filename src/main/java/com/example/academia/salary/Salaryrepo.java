package com.example.academia.salary;

import com.example.academia.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Salaryrepo extends JpaRepository <Salary,Integer> {
    List<Salary> findSalariesByEmployee(Employee employee);
}
