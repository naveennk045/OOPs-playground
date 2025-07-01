package payment;


import models.CreditCardDetails;

public class CreditCardPayment extends PaymentMethod {
    private CreditCardDetails card;

    public CreditCardPayment(CreditCardDetails card) {
        this.card = card;
    }

    @Override
    public void validate() {
        System.out.println("Validating credit card...");
        if (card.getCardNumber().length() != 19) {
            throw new IllegalArgumentException("Invalid card number length!");
        }
        if (card.getCvv().length() != 3) {
            throw new IllegalArgumentException("Invalid CVV!");
        }
        System.out.println("Card validated.");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card ending with " +
                card.getCardNumber().substring(card.getCardNumber().length() - 4));
    }
}
