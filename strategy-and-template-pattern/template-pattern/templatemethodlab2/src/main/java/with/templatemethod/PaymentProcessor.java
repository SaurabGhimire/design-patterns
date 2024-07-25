package with.templatemethod;

import without.templatemethod.Customer;
import without.templatemethod.VisaCard;

public abstract class PaymentProcessor {
    double amount;
    String currency;
    Customer customer;
    double dollarAmount;

    PaymentProcessor(double amount, String currency, Customer customer
                     ){
        this.amount = amount;
        this.currency = currency;
        this.customer = customer;
    }
    public double convertToUSDollars(){
        dollarAmount = amount;
        if (currency.contentEquals("EUR")) { // European Euro
            dollarAmount = amount * 1.1;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        if (currency.contentEquals("INR")) { // Indian Rupee
            dollarAmount = amount * 0.014;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        return dollarAmount;
    }

    public void proccessPayment(){
        dollarAmount = convertToUSDollars();
        if(validate()){
            pay();
            notifyUser();
            return;
        }
        System.out.println("Could not verify user");
    }
    public abstract boolean validate();
    abstract public void pay();
    abstract public void notifyUser();

}
