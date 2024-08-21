package com.project.smart_shelf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.smart_shelf.Model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
