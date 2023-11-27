package com.example.academia.employee;

import com.example.academia.department.Department;
import com.example.academia.salary.Salary;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String title;
    private String photograph;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @OneToMany( mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Salary> salary=new ArrayList<>();

    public Employee(Integer id, String fname, String lname, String email, String password, String title, String photograph, Department department) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.title = title;
        this.photograph = photograph;
        this.department = department;
    }
}
