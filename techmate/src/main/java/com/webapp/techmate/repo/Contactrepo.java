package com.webapp.techmate.repo;

import com.webapp.techmate.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contactrepo extends  JpaRepository<Contact ,Integer> {

}
