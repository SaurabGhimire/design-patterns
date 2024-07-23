package bank.domain.commands;

import bank.domain.Account;

public class DepositComand implements Command{
    Account account;
    double amount;

    public DepositComand(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unexecute() {
        account.withdraw(amount);
    }
}
