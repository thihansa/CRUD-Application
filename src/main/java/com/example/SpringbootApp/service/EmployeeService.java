package com.example.SpringbootApp.service;

import com.example.SpringbootApp.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee insertEmployee(Employee employee);
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employeeDetails);
    void deleteEmployeeById(long id);
}
