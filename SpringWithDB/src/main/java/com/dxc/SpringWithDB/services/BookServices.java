package com.dxc.SpringWithDB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxc.SpringWithDB.entity.Book;
import com.dxc.SpringWithDB.repository.BookIRepository;

@Component
public class BookServices {
	@Autowired
	private BookIRepository br;

	public List<Book> getAllBooks() {
		List<Book> bookList = (List<Book>) br.findAll();
		return bookList;

	}

}