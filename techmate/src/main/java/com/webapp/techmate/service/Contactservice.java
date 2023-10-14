package com.webapp.techmate.service;

import com.webapp.techmate.Mailsender;
import com.webapp.techmate.entity.Contact;
import com.webapp.techmate.repo.Contactrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Contactservice {
    @Autowired
    private Contactrepo contactrepo;
    @Autowired
    private Mailsender mailsender;


    @PostMapping("/contact")
    public String createContact(@RequestBody Contact contact){
        contactrepo.save(contact);

        mailsender.sendSimpleEmail(contact);
        mailsender.newUserContact(contact);
        return "Contact saved";
    }

    public List<Contact> getAllContact(){
         List<Contact> contacts=contactrepo.findAll();
         return  contacts;
    }
}

