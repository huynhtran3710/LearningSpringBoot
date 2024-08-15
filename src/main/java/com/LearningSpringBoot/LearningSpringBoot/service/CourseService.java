package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToMany.CourseRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToMany.CourseResponse;
import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToMany.Course;
import com.LearningSpringBoot.LearningSpringBoot.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseResponse saveCourse(CourseRequest courseRequest) {
        Course course = new Course();
        course.setTitle(courseRequest.getTitle());
        course = courseRepository.save(course);
        return new CourseResponse(course.getId(), course.getTitle());
    }

    public CourseResponse getCourseById(Long id) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course == null) {
            return null;
        }
        return new CourseResponse(course.getId(), course.getTitle());
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
