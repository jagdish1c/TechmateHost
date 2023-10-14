package com.webapp.techmate.controller;

import com.webapp.techmate.entity.Contact;
import com.webapp.techmate.service.Contactservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://techmate-by-jagdish.netlify.app")
public class Contactcontroller {
    @Autowired
    private Contactservice contactservice;

    @PostMapping("/contact")
    public  String createContact(@RequestBody Contact contact){
        return contactservice.createContact(contact);
    }

    @GetMapping("/contact")
    public List<Contact> getContact(){
       return contactservice.getAllContact();
    }
}

