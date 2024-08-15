package com.LearningSpringBoot.LearningSpringBoot.controller;


import com.LearningSpringBoot.LearningSpringBoot.dto.request.OneToOne.PersonRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.OneToOne.PersonResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public PersonResponse savePerson(@RequestBody PersonRequest personRequest) {
        return personService.savePerson(personRequest);
    }

    @GetMapping("/{id}")
    public PersonResponse getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}
