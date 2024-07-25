package with.templatemethod;

import without.templatemethod.Customer;
import with.templatemethod.PaymentProcessor;
import without.templatemethod.VisaCard;

public class VisaCardProcessor extends PaymentProcessor {
    VisaCard visaCard;
    public VisaCardProcessor(double amount, String currency, Customer customer, VisaCard visaCard
    ){
        super(amount, currency, customer);
        this.visaCard = visaCard;
    }

    @Override
    public  boolean validate(){
        // logic to validate visa card
        System.out.println("Validate visa card with card number " + visaCard.getCreditCardNumber());
        return true;
    }

    @Override
    public void pay(){
        // logic to perform payment visa card
        System.out.println("Perform payment with visa card with card number " + visaCard.getCreditCardNumber()
                + " and amount $" + dollarAmount);
    }

    @Override
    public  void notifyUser(){
        // logic to notify customer
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                + " about visa credit card payment with card number " + visaCard.getCreditCardNumber());

    }

}
