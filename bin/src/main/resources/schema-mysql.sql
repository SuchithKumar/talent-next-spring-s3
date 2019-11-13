DROP TABLE IF EXISTS book_details;

CREATE TABLE book_details (
	id INT NOT NULL AUTO_INCREMENT,
	book_title VARCHAR(50) NOT NULL,
	book_publisher VARCHAR(50) NOT NULL,
	book_isbn VARCHAR(20) NOT NULL,
	book_number_of_pages INTEGER NOT NULL,
	book_year INTEGER NOT NULL,
	PRIMARY KEY ( id )
	);
	
