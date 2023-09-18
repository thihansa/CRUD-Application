package com.example.SpringbootApp.controller;

import com.example.SpringbootApp.model.Employee;
import com.example.SpringbootApp.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

//  create employee
    @PostMapping("/insertEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }

//  get employee by id
    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

//  update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employeeDetails){
        employeeService.updateEmployee(employeeDetails);
        return employeeDetails;
    }

//  delete employee
    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployeeById(id);
    }
}
