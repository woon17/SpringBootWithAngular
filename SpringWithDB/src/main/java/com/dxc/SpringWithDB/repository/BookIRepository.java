package com.dxc.SpringWithDB.repository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.SpringWithDB.entity.Book;

public interface BookIRepository extends CrudRepository<Book, Integer> {

	public Book findById(int id);

}
