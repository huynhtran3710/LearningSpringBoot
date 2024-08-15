package com.LearningSpringBoot.LearningSpringBoot.dto.request.OneToOne;



public class PassportRequest {
    private String number;
    private Long personId; // ID của người có hộ chiếu

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
}