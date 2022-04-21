package com.dxc.SpringWithDB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxc.SpringWithDB.entity.Book;
import com.dxc.SpringWithDB.repository.BookRepository;

@Component
public class BookServices {
	@Autowired
	private BookRepository br;

	public List<Book> getAllBooks() {
		List<Book> bookList = (List<Book>) br.findAll();
		return bookList;
	}

	public Book getBookById(int id) {
		Book book = null;
		book = br.findById(id);
		return book;

	}

	public Book addBook(Book b) {
		Book book = br.save(b);
		return book;
	}

	public void deleteBook(int id) {
		br.deleteById(id);
	}

	public void updateBookById(int id, Book b) {
		b.setId(id);
		br.save(b);
	}

}
