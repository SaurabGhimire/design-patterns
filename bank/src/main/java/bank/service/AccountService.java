package bank.service;

import java.util.Collection;

import bank.commands.*;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.domain.commands.*;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	HistoryList commandsHistory;

	
	public AccountService(){
		accountDAO=new AccountDAO();
		this.commandsHistory = new HistoryList();
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		Command command = new DepositComand(account, amount);
		command.execute();
		commandsHistory.add(command);
//		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		Command command = new WithdrawCommand(account, amount);
		command.execute();
		commandsHistory.add(command);
//		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);

		Command command = new TransferCommand(fromAccount, toAccount, amount, description);
		command.execute();

//		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	public void undo(){
		commandsHistory.undo();
	}

	public void redo(){
		commandsHistory.redo();
	}
}
