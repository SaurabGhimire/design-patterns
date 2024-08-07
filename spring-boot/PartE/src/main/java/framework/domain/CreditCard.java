package framework.domain;

import java.time.LocalDate;

public class CreditCard {
    long cardNumber;
    LocalDate validationDate;

    public CreditCard(long cardNumber, LocalDate validationDate) {
        this.cardNumber = cardNumber;
        this.validationDate = validationDate;
    }
}
