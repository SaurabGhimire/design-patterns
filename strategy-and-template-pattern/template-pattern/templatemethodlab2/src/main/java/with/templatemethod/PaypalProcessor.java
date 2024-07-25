package with.templatemethod;

import without.templatemethod.Customer;

public class PaypalProcessor extends PaymentProcessor{
    String paypalAddress;
    public PaypalProcessor(double amount, String currency, Customer customer, String paypalAddress){
        super(amount, currency, customer);
        this.paypalAddress = paypalAddress;
    }

    @Override
    public  boolean validate(){
        // logic to validate visa card
        // logic to notify customer
        System.out.println("Perform payment with paypal address "+paypalAddress+" and amount $"+dollarAmount);
        return true;
    }

    @Override
    public void pay(){
        // logic to perform paypal payment
        System.out.println("Perform payment with paypal address "+paypalAddress+" and amount $"+dollarAmount);

    }

    @Override
    public  void notifyUser(){
        // logic to notify customer
        System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+paypalAddress);

    }
}
