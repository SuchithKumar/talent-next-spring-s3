package com.mphasis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.domain.Book;

@Repository(value = "BookRepository")
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	public Optional<Book> findByBookIsbn(String bookIsbn);

	public List<Book> findByBookTitleContaining(String booktitle);
	

}
