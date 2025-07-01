package payment;


public abstract class PaymentMethod {
    public abstract void validate();
    public abstract void pay(double amount);

    public void sendReceipt() {
        System.out.println("Receipt sent to customer email.");
    }
}
