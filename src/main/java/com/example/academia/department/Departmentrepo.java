package com.example.academia.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Departmentrepo extends JpaRepository <Department, Integer > {

}
