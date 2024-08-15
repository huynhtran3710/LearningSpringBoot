package com.LearningSpringBoot.LearningSpringBoot.dto.response.OneToOne;



public class PassportResponse {
    private Long id;
    private String number;
    private Long personId; // ID của người có hộ chiếu

    public PassportResponse(Long id, String number) {
        this.id = id;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}