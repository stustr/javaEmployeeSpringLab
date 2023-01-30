package com.codeclan.example.employeeTracking;

import com.codeclan.example.employeeTracking.models.Employee;
import com.codeclan.example.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {

		Employee dave = new Employee("Dave", 25, 123,
				"dave@dave.com");
		Employee mary = new Employee("Mary", 25, 123,
				"mary@mary.com");
		employeeRepository.save(dave);
		employeeRepository.save(mary);
	}
}
