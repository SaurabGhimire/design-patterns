package org.example;

import java.time.LocalDate;
import java.util.List;

public class IndividualOrder extends Order{
    String name;
    public IndividualOrder(List<OrderLine> orderLineList, LocalDate date, double amount, String state, String name) {
        super(orderLineList, date, amount, state);
        this.name = name;
    }
}
