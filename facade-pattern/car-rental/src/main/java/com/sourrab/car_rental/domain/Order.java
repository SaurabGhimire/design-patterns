package com.sourrab.car_rental.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    Address billingAddress;
    @ManyToOne(cascade = CascadeType.ALL)
    Address shippingAddress;
    @ManyToOne(cascade = CascadeType.ALL)
    Customer customer;
    @OneToOne(cascade = CascadeType.ALL)
    ShoppingCart shoppingCart;


}
