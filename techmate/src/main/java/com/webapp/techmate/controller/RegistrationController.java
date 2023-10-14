package com.webapp.techmate.controller;

import com.webapp.techmate.entity.Registration;
import com.webapp.techmate.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/registration")
    public String createRegistration(@RequestBody Registration registration){
       return registrationService.createRegistration(registration);
    }
}
