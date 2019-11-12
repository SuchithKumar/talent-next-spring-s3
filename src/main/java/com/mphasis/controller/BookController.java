package com.mphasis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.domain.Book;
import com.mphasis.service.BookServiceImpl;

@RestController
public class BookController {

	@Autowired
	@Qualifier("BookServiceImpl")
	private BookServiceImpl bookService;
	
	@GetMapping(path = "/books/{book_id}")
	public Optional<Book> findByBookId(@PathVariable("book_id") Integer id){
		return bookService.findByBookId(id);
	}
	
	@GetMapping(path = "/books/search/{book_title}")
	public List<Book> findByBookTitle(@PathVariable("book_title") String title){
		return bookService.findByBookTitle(title);
	}
	
	@GetMapping(path="/books")
	public List<Book> findAll(){
		return bookService.findAll();
	}
	
	@PostMapping(path="/books")
	public void save(Book book) {
		bookService.save(book);
	}
	
}
