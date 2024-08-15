package com.LearningSpringBoot.LearningSpringBoot.dto.response.OneToOne;

public class PersonResponse {
    private Long id;
    private String name;

    public PersonResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
            return name;
        }
    public void setName(String name) {
            this.name = name;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
