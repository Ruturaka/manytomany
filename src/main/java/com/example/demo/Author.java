package com.example.demo;

import lombok.Data;
import org.springframework.data.relational.core.mapping.MappedCollection;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Data
public class Author {
    @Id
    private int id;
    @Column("name")
    private String name;

    @MappedCollection(idColumn = "id")
    private Set<BookRef> books = new HashSet<>();

    public void addBook(Book book){
        books.add(new BookRef(book.getId()));
    }

}
