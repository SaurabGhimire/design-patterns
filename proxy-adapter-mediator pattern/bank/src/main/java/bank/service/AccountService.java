package bank.service;

import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.stream.Collectors;

import bank.adapter.AccountAdapter;
import bank.adapter.AccountDTO;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.proxy.LoggingProxy;
import bank.proxy.TimingProxy;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		AccountDAO tempAccountDao = new AccountDAO();
		IAccountDAO loggingProxyAccountDAO=new LoggingProxy(tempAccountDao);
		ClassLoader classLoader = IAccountDAO.class.getClassLoader();
		accountDAO = (IAccountDAO) Proxy.newProxyInstance(
				classLoader,
				new Class[]{ IAccountDAO.class},
				new TimingProxy(loggingProxyAccountDAO)
		);

	}

	public AccountDTO createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return AccountAdapter.getAccountDTO(account);
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public AccountDTO getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return AccountAdapter.getAccountDTO(account);
	}

	public Collection<AccountDTO> getAllAccounts() {
		return accountDAO.getAccounts().stream().map(account -> AccountAdapter.getAccountDTO(account)).collect(Collectors.toList());
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
