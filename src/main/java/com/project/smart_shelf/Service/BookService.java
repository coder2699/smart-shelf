package com.project.smart_shelf.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.smart_shelf.Dto.BookDto;
import com.project.smart_shelf.Model.Book;
import com.project.smart_shelf.Repository.BookRepository;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public ResponseEntity<List<BookDto>> getAllBooks() {
        try {
        List<Book> books = bookRepository.findAll();
        
        // Map Book entities to BookDTOs
        return new ResponseEntity<>(books.stream()
                    .map(book -> new BookDto(book.getId(), book.getTitle(), book.getIsbn(), 
                                              book.getPublicationDate(), book.getAuthorId(), 
                                              book.getAvailableCopies()))
                    .collect(Collectors.toList()), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<BookDto> getByID(Integer id) {
        try {
            Optional<Book> optionalBook = bookRepository.findById(id);
                // Map Book entity to BookDTO
                if (optionalBook.isPresent()){
                    Book book = optionalBook.get();
                    return new ResponseEntity<>(new BookDto(book.getId(), book.getTitle(), book.getIsbn(), 
                    book.getPublicationDate(), book.getAuthorId(), 
                    book.getAvailableCopies()), HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(new BookDto(id, null, null, null, null, null),HttpStatus.OK);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new BookDto(id, null, null, null, null, id), HttpStatus.BAD_REQUEST);
    }
}
