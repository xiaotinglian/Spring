package com.genspark.springbootassignment1.Controller;

import com.genspark.springbootassignment1.Entity.Employee;
import com.genspark.springbootassignment1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    //Request from url http://localhost:8080/home?name=John
//    @RequestMapping("home")
//    public String Home(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="age", defaultValue="0") String age) {
//        return "Hello " + name+" "+age;
//    }

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String Home() {
        return "<HTML><h1>Hello World</h1></HTML>";
    }
    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        return this.employeeService.getAllEmployees();
    }

}
