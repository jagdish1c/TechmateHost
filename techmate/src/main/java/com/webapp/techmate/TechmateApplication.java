package com.webapp.techmate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Random;

@SpringBootApplication
public class TechmateApplication {
	@Autowired
	private Mailsender mailsender;

	public static void main(String[] args) {
		SpringApplication.run(TechmateApplication.class, args);
	}


}
