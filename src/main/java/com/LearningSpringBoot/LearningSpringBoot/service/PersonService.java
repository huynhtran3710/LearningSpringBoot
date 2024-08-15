package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.OneToOne.PersonRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.OneToOne.PersonResponse;
import com.LearningSpringBoot.LearningSpringBoot.entity.OneToOne.Person;
import com.LearningSpringBoot.LearningSpringBoot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonResponse savePerson(PersonRequest personRequest) {
        Person person = new Person();
        person.setName(personRequest.getName());
        person = personRepository.save(person);
        return new PersonResponse(person.getId(), person.getName());
    }

    public PersonResponse getPersonById(Long id) {
        Person person = personRepository.findById(id).orElse(null);
        if (person == null) {
            return null;
        }
        return new PersonResponse(person.getId(), person.getName());
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
