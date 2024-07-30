package bank.proxy;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;

import java.util.Collection;

public class LoggingProxy implements IAccountDAO {
    IAccountDAO accountDAO;
    public LoggingProxy(IAccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    public void log(String message){
        System.out.println(message);
    }

    @Override
    public void saveAccount(Account account) {
        log("Saving to account :" + account);
        accountDAO.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        log("Updating to account :" + account);
        accountDAO.updateAccount(account);
    }

    @Override
    public Account loadAccount(long accountnumber) {
        Account account = accountDAO.loadAccount(accountnumber);
        log("Loading account :" + account);
        return account;
    }

    @Override
    public Collection<Account> getAccounts() {
        Collection<Account> accounts = accountDAO.getAccounts();
        log("Getting all accounts :" + accounts);
        return accounts;
    }
}
