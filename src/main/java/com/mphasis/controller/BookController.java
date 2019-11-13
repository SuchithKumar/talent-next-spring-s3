package com.mphasis.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mphasis.Exception.BookNotFoundException;
import com.mphasis.domain.Book;
import com.mphasis.service.BookServiceImpl;

@RestController
public class BookController {

	@Autowired
	@Qualifier("BookServiceImpl")
	private BookServiceImpl bookService;

	@GetMapping(path = "/books/{book_id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Book findByBookId(@PathVariable("book_id") Integer id) {
		Optional<Book> book = bookService.findByBookId(id);
		if (book.isPresent()) {
			return book.get();
		} else {
			throw new BookNotFoundException("Book with ID :" + id + " Not found!");
		}
	}

	@GetMapping(path = "/books/search/{book_title}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Book> findByBookTitle(@PathVariable("book_title") String title) {
		return bookService.findByBookTitle(title);
	}

	@GetMapping(path = "/books", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Book> findAll() {
		return bookService.findAll();
	}

	@PostMapping(path = "/books", 
				 produces = { MediaType.APPLICATION_JSON_VALUE }, 
				 consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Book> save(@RequestBody Book book) {
		Book savedBook = bookService.save(book);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(savedBook.getId());
		return ResponseEntity.created(uri).build();
	}

}
