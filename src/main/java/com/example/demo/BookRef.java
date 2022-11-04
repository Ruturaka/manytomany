package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Table;

@Table
@Data
@AllArgsConstructor
public class BookRef {
    //BookRef entity is just to hold Book entity Ids.
    int id;
}
