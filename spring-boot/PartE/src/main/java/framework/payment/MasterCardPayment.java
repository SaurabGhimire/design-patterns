package framework.payment;

import framework.domain.CreditCard;

public class MasterCardPayment implements Payment {
    CreditCard creditCard;
    public MasterCardPayment(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying using master card");
    }
}
