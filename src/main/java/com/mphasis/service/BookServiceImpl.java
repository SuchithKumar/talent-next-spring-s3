package com.mphasis.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mphasis.domain.Book;
import com.mphasis.repository.BookRepository;

@Service(value = "BookServiceImpl")
@Transactional
public class BookServiceImpl implements BookService{

	@Autowired
	@Qualifier("BookRepository")
	private BookRepository bookRepo;
	
	public Optional<Book> findByBookId(Integer id){
		return bookRepo.findById(id);
	}

	@Override
	public List<Book> findByBookTitle(String title) {
		return bookRepo.findByBookTitleContaining(title);
	}

	public List<Book> findAll(){
		return bookRepo.findAll();
	}
	
	@Override
	public void save(Book book) {
		bookRepo.save(book);
	}
}
