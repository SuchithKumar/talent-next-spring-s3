package com.mphasis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_details")
public class Book {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "book_title")
	private String bookTitle;
	
	@Column(name = "book_publisher")
	private String bookPublisher;
	
	@Column(name = "book_isbn")
	private String bookIsbn;
	
	@Column(name = "book_number_of_pages")
	private Integer bookNumberOfPages;
	
	@Column(name = "book_year")
	private Integer bookYear;
	

	public Book() {
		
	}

	public Book(String bookTitle, String bookPublisher, String bookIsbn, Integer bookNumberOfPages, Integer bookYear) {
		super();
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookIsbn = bookIsbn;
		this.bookNumberOfPages = bookNumberOfPages;
		this.bookYear = bookYear;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public Integer getBookNumberOfPages() {
		return bookNumberOfPages;
	}

	public void setBookNumberOfPages(Integer bookNumberOfPages) {
		this.bookNumberOfPages = bookNumberOfPages;
	}

	public Integer getBookYear() {
		return bookYear;
	}

	public void setBookYear(Integer bookYear) {
		this.bookYear = bookYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher + ", bookIsbn="
				+ bookIsbn + ", bookNumberOfPages=" + bookNumberOfPages + ", bookYear=" + bookYear + "]";
	}
	

}
