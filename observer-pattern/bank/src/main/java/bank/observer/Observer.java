package bank.observer;

import bank.service.AccountService;

public abstract class Observer {
    protected AccountService accountService;
    public Observer(AccountService accountService) {
        this.accountService = accountService;
    }
    public abstract void update();
}
