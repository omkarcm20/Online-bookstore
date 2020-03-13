package com.omkar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{		//name of entity and type of primary key

}
