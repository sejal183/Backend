package com.example.academia.salary;

import com.example.academia.department.Department;
import com.example.academia.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Salary {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date pdate;
    private Float amount;
    private String description;
    @ManyToOne
    @JoinColumn(name = "salary_id")
    private Employee employee;
}
