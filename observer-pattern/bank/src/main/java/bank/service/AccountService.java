package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.observer.Subject;
import bank.utils.EmailSender;
import bank.utils.Logger;
import bank.utils.SmsSender;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private Subject accountCreationSubject;
	private Subject accountUpdateSubject;

	private Account lastChangedAccount;

	private Account lastCreatedAccount;

	private Logger logger;
	private SmsSender smsSender;
	private EmailSender emailSender;

	
	public AccountService(){
		accountDAO=new AccountDAO();
		accountCreationSubject = new Subject();
		accountUpdateSubject = new Subject();

		logger = new Logger(this);
		smsSender = new SmsSender(this);
		emailSender = new EmailSender(this);

		accountUpdateSubject.addObserver(logger);
		accountUpdateSubject.addObserver(smsSender);

		accountCreationSubject.addObserver(emailSender);
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		setLastChangedAccount(account);
		accountCreationSubject.donotify();
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		setLastChangedAccount(account);
		accountUpdateSubject.donotify();
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
		account.withdraw(amount);
		setLastChangedAccount(account);
		accountUpdateSubject.donotify();

		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		// TODO : see if both accounts is need to be  notified to
		setLastChangedAccount(fromAccount);
		accountUpdateSubject.donotify();

		setLastChangedAccount(toAccount);
		accountUpdateSubject.donotify();

		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	public void setLastChangedAccount(Account lastChangedAccount) {
		this.lastChangedAccount = lastChangedAccount;
	}

	public void setLastCreatedAccount(Account createdAccount) {
		this.lastCreatedAccount = createdAccount;
	}

	public Account getLastCreatedAccount() {
		return lastCreatedAccount;
	}

	public Account getLastChangedAccount(){
		return lastChangedAccount;
	}
}
