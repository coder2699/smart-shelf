package com.project.smart_shelf.Dto;
import java.util.Date;

import lombok.Data;

@Data
public class BookDto {
    private Integer id;
    private String title;
    private String isbn;
    private Date publicationDate;
    private Integer authorId;
    private Integer availableCopies;

    // Constructor
    public BookDto(Integer id, String title, String isbn, Date publicationDate, Integer authorId, Integer availableCopies) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.authorId = authorId;
        this.availableCopies = availableCopies;
    }

}
