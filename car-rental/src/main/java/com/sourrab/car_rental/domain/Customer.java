package com.sourrab.car_rental.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Customer(String name, Long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String name;
    Long phone;
    String email;
}
