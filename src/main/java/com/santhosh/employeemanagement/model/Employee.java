package com.santhosh.employeemanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String department;
    
    // New columns
    private String company;
    private String jobTitle;
    private Double salary;

    public Employee() {
        // Default the company field to "Google"
        this.company = "Google";
    }

    public Employee(String name, String email, String department, String company, String jobTitle, Double salary) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.company = company;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters and Setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
  
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
  
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
  
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}