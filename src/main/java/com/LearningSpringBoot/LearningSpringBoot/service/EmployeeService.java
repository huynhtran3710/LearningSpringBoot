package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToOne.EmployeeRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToOne.EmployeeResponse;
import com.LearningSpringBoot.LearningSpringBoot.entity.ManyToOne.Employee;
import com.LearningSpringBoot.LearningSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setName(employeeRequest.getName());
        // Set Department if necessary
        employee = employeeRepository.save(employee);
        return new EmployeeResponse(employee.getId(), employee.getName());
    }

    public EmployeeResponse getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee == null) {
            return null;
        }
        return new EmployeeResponse(employee.getId(), employee.getName());
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
