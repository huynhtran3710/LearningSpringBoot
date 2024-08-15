package com.LearningSpringBoot.LearningSpringBoot.controller;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToOne.EmployeeRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToOne.EmployeeResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeResponse saveEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return employeeService.saveEmployee(employeeRequest);
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
