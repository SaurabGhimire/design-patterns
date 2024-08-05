package org.example;

import java.time.LocalDate;
import java.util.List;

public class Order {
    List<OrderLine> orderLineList;
    LocalDate date;
    double amount;
    String state;

    public Order(List<OrderLine> orderLineList, LocalDate date, double amount, String state) {
        this.orderLineList = orderLineList;
        this.date = date;
        this.amount = amount;
        this.state = state;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
