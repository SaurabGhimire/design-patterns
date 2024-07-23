package com.sourrab.car_rental.service;

import com.sourrab.car_rental.domain.*;
import com.sourrab.car_rental.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public void createOrder(){
        ShoppingCart cart = new ShoppingCart();
        Book book1 = new Book("Java Fundamentals", "Author 1");
        BookCopy bookCopy1 = new BookCopy("12345678", book1);
        BookCopy bookCopy2 = new BookCopy("98765432", book1);
        cart.addBook(bookCopy1);
        cart.addBook(bookCopy2);
        Customer customer = new Customer("Saurab", 9843217549L, "email@email.com");
        Address address = new Address("100N 4th St.", "Fairfield", "56000");
        Order order = new Order();
        order.setBillingAddress(address);
        order.setShippingAddress(address);
        order.setCustomer(customer);
        order.setShoppingCart(cart);
        orderRepository.save(order);
    }
}
