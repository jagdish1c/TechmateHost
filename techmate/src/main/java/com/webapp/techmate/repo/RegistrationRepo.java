package com.webapp.techmate.repo;

import com.webapp.techmate.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {
}
