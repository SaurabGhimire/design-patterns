package org.example;

public class TotalAmountVisitor {
    double price;
    public void visit(Order order){
        price += order.amount;
    }

    @Override
    public String toString() {
        return "TotalAmountVisitor{" +
                "price=" + price +
                '}';
    }
}
