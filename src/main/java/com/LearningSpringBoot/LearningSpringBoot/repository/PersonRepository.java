package com.LearningSpringBoot.LearningSpringBoot.repository;

import com.LearningSpringBoot.LearningSpringBoot.entity.OneToOne.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}