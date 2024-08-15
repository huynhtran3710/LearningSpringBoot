package com.LearningSpringBoot.LearningSpringBoot.controller;


import com.LearningSpringBoot.LearningSpringBoot.dto.request.OneToOne.PassportRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.OneToOne.PassportResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passports")
public class PassportController {

    @Autowired
    private PassportService passportService;

    @PostMapping
    public PassportResponse savePassport(@RequestBody PassportRequest passportRequest) {
        return passportService.savePassport(passportRequest);
    }

    @GetMapping("/{id}")
    public PassportResponse getPassportById(@PathVariable Long id) {
        return passportService.getPassportById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePassport(@PathVariable Long id) {
        passportService.deletePassport(id);
    }
}
