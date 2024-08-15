package com.LearningSpringBoot.LearningSpringBoot.dto.response.ManyToMany;


public class CourseResponse {
    private Long id;
    private String title;

    public CourseResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}