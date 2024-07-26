package bank.utils;

import bank.domain.Account;
import bank.observer.Observer;
import bank.service.AccountService;

public class Logger extends Observer {

    public Logger(AccountService accountService) {
        super(accountService);
    }

    public  void  handleAccountChange(Account account){
        System.out.println("Logging change in account: "  + account.getAccountnumber());
    }
    @Override
    public void update() {
        Account account = accountService.getLastChangedAccount();
        handleAccountChange(account);
    }
}
