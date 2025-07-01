package payment;


import models.UpiDetails;

public class UpiPayment extends PaymentMethod {
    private UpiDetails upi;

    public UpiPayment(UpiDetails upi) {
        this.upi = upi;
    }

    @Override
    public void validate() {
        System.out.println("Validating UPI ID...");
        if (!upi.getUpiId().contains("@")) {
            throw new IllegalArgumentException("Invalid UPI ID format.");
        }
        System.out.println("✔ UPI ID validated.");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upi.getUpiId());
    }
}
