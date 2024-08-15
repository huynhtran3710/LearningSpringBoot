package com.LearningSpringBoot.LearningSpringBoot.repository;

import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToMany.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}