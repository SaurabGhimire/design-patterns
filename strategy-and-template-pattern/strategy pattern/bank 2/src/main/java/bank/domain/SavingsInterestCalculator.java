package bank.domain;

public class SavingsInterestCalculator implements InterestCalculator{
    @Override
    public double calculate(double balance) {
        double interest = 0.0;
        if(balance < 1000){
             interest = 0.01 * balance;
        } else if(balance >1000 && balance<5000){
            interest = 0.02 * balance;
        } else {
            interest = 0.04*balance;
        }
        return interest;
    }
}
