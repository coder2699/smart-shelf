package com.project.smart_shelf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.smart_shelf.Model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
