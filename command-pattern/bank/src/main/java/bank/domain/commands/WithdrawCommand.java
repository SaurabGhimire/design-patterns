package bank.domain.commands;

import bank.domain.Account;

public class WithdrawCommand implements Command{
    Account account;
    double amount;


    public WithdrawCommand(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void unexecute() {
        account.deposit(amount);
    }

    public Account getAccount() {
        return account;
    }
}
