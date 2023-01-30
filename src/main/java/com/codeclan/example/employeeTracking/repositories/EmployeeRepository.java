package com.codeclan.example.employeeTracking.repositories;

import com.codeclan.example.employeeTracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
