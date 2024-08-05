package org.example;

public class OrderLine {
    Product product;
    int quantity;
    OrderLine(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
}
