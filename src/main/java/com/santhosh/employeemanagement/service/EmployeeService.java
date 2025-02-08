package com.santhosh.employeemanagement.service;

import com.santhosh.employeemanagement.model.Employee;
import com.santhosh.employeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // All Employee Details
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Employee Details - ID
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Add a New Employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Update Employee Details
    public Optional<Employee> updateEmployee(Long id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setDepartment(updatedEmployee.getDepartment());
            employee.setCompany(updatedEmployee.getCompany()); 
            employee.setJobTitle(updatedEmployee.getJobTitle());
            employee.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(employee);
        });
    }

    // Delete Employee
    public boolean deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
