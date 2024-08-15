package com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToOne;


public class EmployeeRequest {
    private String name;
    private Long departmentId; // ID của phòng ban mà nhân viên thuộc về

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}