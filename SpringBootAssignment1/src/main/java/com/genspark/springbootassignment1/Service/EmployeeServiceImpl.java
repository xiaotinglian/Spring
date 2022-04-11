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
        list.add(new Employee(1, "John", "John@gmail.com"));
        list.add(new Employee(2, "Jane", "Jane@gmail.com"));
        list.add(new Employee(3, "Jene", "Jene@gmail.com"));
    }

    @Override
    public Employee getByEmployeeId(int id){
        Employee c = null;
        for (Employee employee : this.list){
            if (employee.getEmployeeId() == id) {
                c = employee;
                break;
            }
        }

        return c;
    }
    @Override
    public List<Employee> getAllEmployees(){
        return list;
    }
    @Override
    public Employee addEmployee(Employee Employee){
        list.add(Employee);
        return getByEmployeeId(Employee.getEmployeeId());
    }
    @Override
    public Employee updateEmployee(Employee Employee){
        String title = Employee.getName();
        String instructor = Employee.getEmail();
        Employee c = null;
        for ( Employee e : this.list){
            if (e.getEmployeeId() == Employee.getEmployeeId()){
                e.setName(title);
                e.setEmail(instructor);
                c = e;
                break;
            }
        }
        return c;
    }
    @Override
    public String deleteEmployee(int EmployeeId){
        Employee c = null;
        for ( Employee e : this.list){
            if (e.getEmployeeId() == EmployeeId){
                list.remove(e);
                break;
            }
        }
        return "delete success";
    }
}
