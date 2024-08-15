package com.LearningSpringBoot.LearningSpringBoot.dto.request.ManyToMany;

import java.util.Set;

public class StudentRequest {

    private String name;
    private Set<Long> courseIds;

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
}
