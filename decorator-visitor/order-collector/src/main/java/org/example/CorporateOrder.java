package org.example;

import java.time.LocalDate;
import java.util.List;

public class CorporateOrder extends  Order{
    String company;
    String contact;

    public CorporateOrder(List<OrderLine> orderLineList, LocalDate date, double amount, String state, String company, String contact) {
        super(orderLineList, date, amount, state);
        this.company = company;
        this.contact = contact;
    }
}
