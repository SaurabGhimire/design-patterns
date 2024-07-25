package with.templatemethod;

public abstract class PaymentProcessor {
    public double convertToUSDollars(String currency, double amount){
        double dollarAmount = amount;
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
    abstract public double validate();
    abstract public double pay();
    abstract public double notifyUser();

}
