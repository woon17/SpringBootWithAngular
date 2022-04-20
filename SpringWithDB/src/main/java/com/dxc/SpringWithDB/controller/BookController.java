package com.dxc.SpringWithDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.SpringWithDB.entity.Book;
import com.dxc.SpringWithDB.services.BookServices;

@RestController
public class BookController {
	@Autowired
	private BookServices bs;

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bs.getAllBooks();
	}
	
//	@GetMapping("/getBooks/{id}")
//	public List<Book> getBooks(@PathVariable ) {
//		return bs.getAllBooks();
//	}
}
