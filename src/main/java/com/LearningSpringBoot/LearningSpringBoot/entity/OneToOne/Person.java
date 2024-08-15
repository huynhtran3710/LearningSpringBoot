package com.LearningSpringBoot.LearningSpringBoot.entity.OneToOne;

import jakarta.persistence.*;

    @Entity
    public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToOne(mappedBy = "person")
        private Passport passport;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Passport getPassport() {
            return passport;
        }

        public void setPassport(Passport passport) {
            this.passport = passport;
        }
    }
