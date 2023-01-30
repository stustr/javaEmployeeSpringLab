package com.codeclan.example.employeeTracking.models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "employeeNumber")
    private Integer employeeNumber;

    @Column(name = "email")
    private String email;

    public Employee(String name, Integer age,
                    Integer employeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }

    public Employee() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
