package com.webapp.techmate.service;

import com.webapp.techmate.entity.Registration;
import com.webapp.techmate.repo.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepo registrationRepo;

    public String createRegistration(Registration registration){
        registrationRepo.save(registration);
        return "Registration Successful";
    }
}

