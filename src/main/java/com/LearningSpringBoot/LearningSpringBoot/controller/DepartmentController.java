package com.LearningSpringBoot.LearningSpringBoot.controller;


import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToOne.DepartmentRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToOne.DepartmentResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public DepartmentResponse saveDepartment(@RequestBody DepartmentRequest departmentRequest) {
        return departmentService.saveDepartment(departmentRequest);
    }

    @GetMapping("/{id}")
    public DepartmentResponse getDepartmentById(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
}
