package bank.adapter;

import bank.domain.Account;
import bank.domain.AccountEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class AccountAdapter {
    public static AccountDTO getAccountDTO(Account account){
        AccountEntryAdapter accountEntryAdapter = new AccountEntryAdapter();
        CustomerAdapter customerAdapter = new CustomerAdapter();
        Collection<AccountEntryDTO> accountEntryDTOCollection = account.getEntryList().stream().map(accountEntry -> accountEntryAdapter.getAccountEntryDTO(accountEntry)).collect(Collectors.toList());
        return  new AccountDTO(account.getAccountnumber(), accountEntryDTOCollection, customerAdapter.getCustomerDTO(account.getCustomer()));
    }

    public static Account getAccount(AccountDTO accountDTO){
        AccountEntryAdapter accountEntryAdapter = new AccountEntryAdapter();
        CustomerAdapter customerAdapter = new CustomerAdapter();
        Collection<AccountEntry> accountEntryCollection = accountDTO.getEntryList().stream().map(accountEntryDTO -> accountEntryAdapter.getAccountEntry(accountEntryDTO)).collect(Collectors.toList());
        return  new Account(accountDTO.getAccountnumber(), accountEntryCollection, customerAdapter.getCustomer(accountDTO.getCustomer()));
    }
}
