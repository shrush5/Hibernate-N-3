package org.tnsif.dao;

import java.util.List;

import org.tnsif.entities.Book;
//interface
public interface Bookdao {
	
	//abstract method
	List<Book>getAllBooks();
	List<Book>getBooks(String author);
	List<Book>getPriceRange(Float low,Float high);
	Book getBookById(Integer id);
	Long getBookCount();

}
