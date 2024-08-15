package com.LearningSpringBoot.LearningSpringBoot.repository;

import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToOne.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}