package com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToOne;


public class EmployeeResponse {
    private Long id;
    private String name;
    private Long departmentId; // ID của phòng ban mà nhân viên thuộc về

    public EmployeeResponse(Long id, String name) {
        this.id = id;
        this.name = name;

    }

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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}