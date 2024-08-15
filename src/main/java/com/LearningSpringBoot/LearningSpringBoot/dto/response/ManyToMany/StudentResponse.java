package com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToMany;

import java.util.Set;

public class StudentResponse {
    private Long id;
    private String name;
    private Set<Long> courseIds;

    public StudentResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(Set<Long> courseIds) {
        this.courseIds = courseIds;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
