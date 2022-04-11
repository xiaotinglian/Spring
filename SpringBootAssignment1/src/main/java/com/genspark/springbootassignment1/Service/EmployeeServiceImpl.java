package com.genspark.springbootassignment1.Service;

import com.genspark.springbootassignment1.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> list;

    public EmployeeServiceImpl(List<Employee> list) {
        this.list = new ArrayList<>();
        list.add(new Employee(101, "John", "John@gmail.com"));
        list.add(new Employee(2, "Jane", "Jane@gmail.com"));
        list.add(new Employee(3, "Jene", "Jene@gmail.com"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
