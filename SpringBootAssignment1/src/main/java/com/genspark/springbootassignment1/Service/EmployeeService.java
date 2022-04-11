package com.genspark.springbootassignment1.Service;

import com.genspark.springbootassignment1.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getByEmployeeId(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int employeeId);
}

