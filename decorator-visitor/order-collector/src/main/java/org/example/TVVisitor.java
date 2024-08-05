package org.example;

public class TVVisitor {
    int quantity;
    public void visit(Order order){
        for(OrderLine orderLine: order.orderLineList){
            quantity += orderLine.quantity;
        }
    }

    @Override
    public String toString() {
        return "TotalAmountVisitor{" +
                "price=" + quantity +
                '}';
    }
}
