package com.project.smart_shelf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.smart_shelf.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
