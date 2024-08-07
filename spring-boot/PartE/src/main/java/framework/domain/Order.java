package framework.domain;

import framework.payment.Payment;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Order {
    UUID orderNum;
    int amount;
    LocalDate date;
    Address shippingAddress;
    Address billingAddress;
    Customer customer;

    List<ProductLine> productLineList;

    Payment paymentMethod;

    public Order(int amount, LocalDate date, Address shippingAddress, Address billingAddress, Customer customer, List<ProductLine> productLineList, Payment paymentMethod) {
        this.orderNum = UUID.randomUUID();
        this.amount = amount;
        this.date = date;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.customer = customer;
        this.productLineList = productLineList;
        this.paymentMethod = paymentMethod;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setShippingAddress(Address address){
        this.shippingAddress = address;
    }

    public void setBillingAddress(Address address){
        this.billingAddress = address;
    }

    public UUID getOrderNum() {
        return orderNum;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
