package bank.adapter;

import bank.domain.Account;
import bank.domain.AccountEntry;

public class AccountEntryAdapter {
    public AccountEntryDTO getAccountEntryDTO(AccountEntry accountEntry){
        return new AccountEntryDTO(accountEntry.getDate(), accountEntry.getAmount(), accountEntry.getDescription(), accountEntry.getFromAccountNumber(), accountEntry.getFromPersonName());
    }

    public AccountEntry getAccountEntry(AccountEntryDTO accountEntryDTO){
        return  new AccountEntry(accountEntryDTO.getDate(), accountEntryDTO.getAmount(), accountEntryDTO.getDescription(), accountEntryDTO.getFromAccountNumber(), accountEntryDTO.getFromPersonName());
    }
}
