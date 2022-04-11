package com.genspark.springbootassignment1.Controller;

import com.genspark.springbootassignment1.Entity.Employee;
import com.genspark.springbootassignment1.Service.CourseService;
import com.genspark.springbootassignment1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    //Request from url http://localhost:8080/home?name=John&age=25
//    @RequestMapping("home")
//    public String Home(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="age", defaultValue="0") String age) {
//        return "Hello " + name+" "+age;
//    }


    //////courses
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to Course Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID)
    {
        return this.courseService.getCourseById(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID)
    {
        return this.courseService.deleteCourseById(Integer.parseInt(courseID));
    }


//////////employees
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId){
        return this.employeeService.getByEmployeeId(Integer.parseInt(employeeId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateCourse(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId){
        this.employeeService.deleteEmployee(Integer.parseInt(employeeId));
        return "Deleted Successfully";
    }

}
