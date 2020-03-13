package com.omkar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.omkar.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel ="Book-Category",path="book-category")       //this manages the name on Url and the path which is to be shown ....this is not done in book repository
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{

}
