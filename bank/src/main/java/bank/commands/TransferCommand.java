package bank.commands;

import bank.domain.Account;

public class TransferCommand implements Command{
    Account fromAccount;

    Account toAccount;
    double amount;
    String description;

    public TransferCommand(Account fromAccount, Account toAccount, double amount, String description){
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void execute() {
        fromAccount.transferFunds(toAccount, amount, description);
    }

    @Override
    public void unexecute() {
        toAccount.transferFunds(fromAccount, amount, description);
    }
}
