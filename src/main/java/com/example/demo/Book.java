package com.example.demo;

import lombok.Data;

import javax.persistence.Id;

@Data //lombok
public class Book {
    @Id
    private int id;
    private String title;
    private String description;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
