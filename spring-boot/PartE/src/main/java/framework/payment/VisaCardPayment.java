package framework.payment;

import framework.domain.CreditCard;

public class VisaCardPayment implements Payment {
    CreditCard card;
    public VisaCardPayment(CreditCard creditCard){}
    @Override
    public void pay(int amount) {
        System.out.println("Paying using visa card");
    }
}
