package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToMany.StudentRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToMany.StudentResponse;
import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToMany.Student;
import com.LearningSpringBoot.LearningSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentResponse saveStudent(StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        student = studentRepository.save(student);
        return new StudentResponse(student.getId(), student.getName());
    }

    public StudentResponse getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student == null) {
            return null;
        }
        return new StudentResponse(student.getId(), student.getName());
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
