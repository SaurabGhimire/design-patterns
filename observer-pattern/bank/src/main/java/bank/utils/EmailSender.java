package bank.utils;

import bank.domain.Account;
import bank.observer.Observer;
import bank.service.AccountService;

public class EmailSender extends Observer {
    public EmailSender(AccountService accountService){
        super(accountService);
    }

    public void handleAccountCreation(Account account) {
        System.out.println("Sending Email to new Account :" + account);
    }
    @Override
    public void update() {
        Account account = accountService.getLastCreatedAccount();
        handleAccountCreation(account);
    }
}
