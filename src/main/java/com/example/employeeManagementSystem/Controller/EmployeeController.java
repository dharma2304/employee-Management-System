package com.example.employeeManagementSystem.Controller;

import com.example.employeeManagementSystem.Model.Employee;
import com.example.employeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee getEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
