package bank.service;

import java.util.Collection;
import bank.domain.Account;
import bank.domain.AccountTypeEnum;

public interface IAccountService {
    Account createAccount(long accountNumber, String customerName, AccountTypeEnum accountType);
    Account getAccount(long accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (long accountNumber, double amount);
    void withdraw (long accountNumber, double amount);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);

    void addInterest();
}
