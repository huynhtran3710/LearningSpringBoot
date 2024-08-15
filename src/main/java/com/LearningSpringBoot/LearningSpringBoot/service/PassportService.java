package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.dto.request.OneToOne.PassportRequest;
import com.LearningSpringBoot.LearningSpringBoot.dto.response.OneToOne.PassportResponse;
import com.LearningSpringBoot.LearningSpringBoot.entity.OneToOne.Passport;
import com.LearningSpringBoot.LearningSpringBoot.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportService {

    @Autowired
    private PassportRepository passportRepository;

    public PassportResponse savePassport(PassportRequest passportRequest) {
        Passport passport = new Passport();
        passport.setNumber(passportRequest.getNumber());
        passport = passportRepository.save(passport);
        return new PassportResponse(passport.getId(), passport.getNumber());
    }

    public PassportResponse getPassportById(Long id) {
        Passport passport = passportRepository.findById(id).orElse(null);
        if (passport == null) {
            return null;
        }
        return new PassportResponse(passport.getId(), passport.getNumber());
    }

    public void deletePassport(Long id) {
        passportRepository.deleteById(id);
    }
}
