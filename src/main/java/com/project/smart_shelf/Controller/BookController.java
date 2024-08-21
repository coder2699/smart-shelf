package com.project.smart_shelf.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.smart_shelf.Dto.BookDto;
import com.project.smart_shelf.Service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    @GetMapping("get/{id}")
    public ResponseEntity<BookDto> getMethodName(@PathVariable Integer id) {
        return bookService.getByID(id);
    }
}
