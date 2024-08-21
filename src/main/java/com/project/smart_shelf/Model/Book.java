package com.project.smart_shelf.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String isbn;

    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @Column(name = "author_id")
    private Integer authorId;

    private Integer availableCopies;

    @ManyToOne
    @JoinColumn(name = "author_id", insertable = false, updatable = false)
    private Author author;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;
}
