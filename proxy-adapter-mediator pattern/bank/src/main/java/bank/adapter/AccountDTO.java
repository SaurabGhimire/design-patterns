package bank.adapter;

import bank.domain.AccountEntry;
import bank.domain.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDTO {
    long accountnumber;
    Collection<AccountEntryDTO> entryList = new ArrayList<AccountEntryDTO>();
    CustomerDTO customer;

    public AccountDTO (long accountnr, Collection<AccountEntryDTO> entryList, CustomerDTO customer){
        this.accountnumber = accountnr;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public Collection<AccountEntryDTO> getEntryList() {
        return entryList;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }
}
