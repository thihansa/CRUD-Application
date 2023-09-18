package com.example.SpringbootApp.repository;

import com.example.SpringbootApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
