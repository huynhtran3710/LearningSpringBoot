package com.LearningSpringBoot.LearningSpringBoot.controller;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToMany.CourseRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToMany.CourseResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public CourseResponse saveCourse(@RequestBody CourseRequest courseRequest) {
        return courseService.saveCourse(courseRequest);
    }

    @GetMapping("/{id}")
    public CourseResponse getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
