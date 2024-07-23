package com.sourrab.car_rental.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
@Entity
@Data
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToMany(cascade = CascadeType.ALL)
    Collection<BookCopy> books;

    public ShoppingCart(){
        this.books = new ArrayList<>();
    }

    public void addBook(BookCopy bookCopy){
        books.add(bookCopy);
    }
}
