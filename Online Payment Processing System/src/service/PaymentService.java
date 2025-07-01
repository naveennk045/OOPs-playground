package service;



import models.Customer;
import payment.PaymentMethod;

public class PaymentService {
    public void processPayment(Customer customer, PaymentMethod method, double amount) {
        System.out.println("Initiating payment for: " + customer.getName() + " (" + customer.getEmail() + ")");
        method.validate();
        method.pay(amount);
        method.sendReceipt();
        System.out.println("Payment completed.\n");
    }
}
