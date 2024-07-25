package bank.domain;

public class CheckingsInterestCalculator implements InterestCalculator{
    @Override
    public double calculate(double balance) {
        double interest = 0.0;
        if(balance < 1000){
            interest = 0.015 * balance;
        } else {
            interest = 0.025 * balance;
        }
        return interest;
    }
}
