package com.project.smart_shelf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.smart_shelf.Model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
