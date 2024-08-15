package com.LearningSpringBoot.LearningSpringBoot.repository;

import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToOne.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
