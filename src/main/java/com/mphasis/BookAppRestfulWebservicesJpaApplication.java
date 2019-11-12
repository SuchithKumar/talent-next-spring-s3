package com.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.domain.Book;
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
		// TODO Auto-generated method stub
		bookRepo.save(new Book(".Net Core in Action", "Dustin Metzgar", "978-1-61729-427-3", 288, 2018));
		bookRepo.save(new Book(".Net Development using Compiler API", "Jason Bock", "978-1484221105", 176, 2016));
//		bookRepo.save(new Book(".Net Core in Action", "Dustin Metzgar", "978-1-61729-427-3", 288, 2018));
//		bookRepo.save(new Book(".Net Core in Action", "Dustin Metzgar", "978-1-61729-427-3", 288, 2018));
//		bookRepo.save(new Book(".Net Core in Action", "Dustin Metzgar", "978-1-61729-427-3", 288, 2018));
		
		System.out.println(bookRepo.findAll());
	}

}
