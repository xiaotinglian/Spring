package com.genspark.springbootassignment2.Service;

import com.genspark.springbootassignment2.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getByEmployeeId(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int employeeId);
}

