package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToOne.DepartmentRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToOne.DepartmentResponse;
import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToOne.Department;
import com.LearningSpringBoot.LearningSpringBoot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentResponse saveDepartment(DepartmentRequest departmentRequest) {
        Department department = new Department();
        department.setName(departmentRequest.getName());
        department = departmentRepository.save(department);
        return new DepartmentResponse(department.getId(), department.getName());
    }

    public DepartmentResponse getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElse(null);
        if (department == null) {
            return null;
        }
        return new DepartmentResponse(department.getId(), department.getName());
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
