package com.LearningSpringBoot.LearningSpringBoot.controller;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToMany.StudentRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToMany.StudentResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentResponse saveStudent(@RequestBody StudentRequest studentRequest) {
        return studentService.saveStudent(studentRequest);
    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
