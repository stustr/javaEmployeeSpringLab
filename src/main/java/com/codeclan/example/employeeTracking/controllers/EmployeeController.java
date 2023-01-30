package com.codeclan.example.employeeTracking.controllers;

import com.codeclan.example.employeeTracking.models.Employee;
import com.codeclan.example.employeeTracking.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    @GetMapping(value = "/employee/{id}/delete")
    public void deleteEmployeeById(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}
