package com.dxc.SpringWithDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.SpringWithDB.entity.Book;
import com.dxc.SpringWithDB.services.BookServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BookController {
	// Injection for BookServices
	@Autowired
	private BookServices bs;

	// this mapping is going to fetch us all the books from database
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bs.getAllBooks();
	}

	//only fetch specific book 
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return bs.getBookById(id);
	}

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book b) {
		Book book = null;
		book = bs.addBook(b);
		return book;
	}

	@DeleteMapping("/deletebook/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		bs.deleteBook(id);
	}

	// update the existing data in the database
	@PutMapping("/updatebook/{id}")
	public void updateBookById(@PathVariable("id") int id, @RequestBody Book b) {
		bs.updateBookById(id, b);
	}
}
