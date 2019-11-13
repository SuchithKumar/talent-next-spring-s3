package com.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.repository.BookRepository;

@SpringBootApplication
public class BookAppRestfulWebservicesJpaApplication implements CommandLineRunner {

	@Autowired 
	BookRepository bookRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BookAppRestfulWebservicesJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(bookRepo.findAll());
	}

}
