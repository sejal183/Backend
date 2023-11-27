package com.example.academia.config;

import com.example.academia.department.Department;
import com.example.academia.department.Departmentrepo;
import com.example.academia.employee.Employee;
import com.example.academia.employee.Employeerepo;
import com.example.academia.salary.Salary;
import com.example.academia.salary.Salaryrepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(Departmentrepo department, Employeerepo employee, Salaryrepo salary){
        return args -> {
//            try {
//                if (department.count() == 0) {
                    Department d1 = new Department(1,"Faculty",70);
                    Department d2 = new Department(2,"Management",100);
                    Department d3 = new Department(3,"Accounts",20);
                    Department d4 = new Department(4,"Security",50);
                    department.saveAll(List.of(d1,d2,d3,d4));

//                    if (employee.count() == 0) {
                        Employee e1 = new Employee(1,"Sejal","Khandelwal","sejal@gmail.com","1234","Director","",d1);
                        Employee e2 = new Employee(2,"Abhinav","Dhoka","abhinav@gmail.com","1234","Dean","",d2);
                        employee.saveAll(List.of(e1,e2));

//                        if (salary.count() == 0) {
                            Salary s1 = new Salary(1, Date.valueOf("2023-09-30"),900000F,"September Month Salary",e1);
                            Salary s2 = new Salary(2, Date.valueOf("2023-09-30"),800000F,"September Month Salary",e2);
                            Salary s3 = new Salary(3,Date.valueOf("2023-09-30"),900000F,"October Month Salary",e1);
                            Salary s4 = new Salary(4, Date.valueOf("2023-09-30"),800000F,"October Month Salary",e2);
                            Salary s5 = new Salary(5,Date.valueOf("2023-09-30"),900000F,"November Month Salary",e1);
                            Salary s6 = new Salary(6, Date.valueOf("2023-09-30"),800000F,"November Month Salary",e2);
                            salary.saveAll(List.of(s1,s2,s3,s4,s5,s6));
//                        }
//                    }
//
//                }



//            }
//            catch (Exception e) {
//                e.printStackTrace();
//            }

            };
    }
}
