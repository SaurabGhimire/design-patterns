package org.example;

import java.time.LocalDate;
import java.util.List;

public class InternalOrder extends Order{
    String department;

    public InternalOrder(List<OrderLine> orderLineList, LocalDate date, double amount, String state, String department) {
        super(orderLineList, date, amount, state);
        this.department = department;
    }
}
