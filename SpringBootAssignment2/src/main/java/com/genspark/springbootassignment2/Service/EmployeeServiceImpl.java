package com.genspark.springbootassignment2.Service;

import com.genspark.springbootassignment2.Dao.EmployeeDao;
import com.genspark.springbootassignment2.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee getByEmployeeId(int id){
        Optional<Employee> optionalEmployee = this.employeeDao.findById(id);
        Employee employee = null;
        if (optionalEmployee.isPresent()){
            employee = optionalEmployee.get();
        }else {
            throw new RuntimeException("Employee not found");
        }
        return employee;
    }
    @Override
    public List<Employee> getAllEmployees(){
        return this.employeeDao.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee){
        return this.employeeDao.save(employee);
    }
    @Override
    public Employee updateEmployee(Employee employee){
        return this.employeeDao.save(employee);
    }
    @Override
    public String deleteEmployee(int employeeId){
        this.employeeDao.deleteById(employeeId);
        return "delete success";
    }
}
