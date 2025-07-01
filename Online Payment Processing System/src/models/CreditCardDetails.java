package models;

public class CreditCardDetails {
    private String cardNumber;
    private String cvv;
    private String expiry;

    public CreditCardDetails(String cardNumber, String cvv, String expiry) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    public String getCardNumber() { return cardNumber; }
    public String getCvv() { return cvv; }
    public String getExpiry() { return expiry; }
}
