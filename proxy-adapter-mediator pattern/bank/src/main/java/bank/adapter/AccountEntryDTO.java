package bank.adapter;

import java.util.Date;

public class AccountEntryDTO {
    private Date date;
    private double amount;
    private String description;
    private String fromAccountNumber;
    private String fromPersonName;

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public String getFromPersonName() {
        return fromPersonName;
    }

    public AccountEntryDTO(Date date, double amount, String description, String fromAccountNumber, String fromPersonName) {
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.fromAccountNumber = fromAccountNumber;
        this.fromPersonName = fromPersonName;
    }
}
