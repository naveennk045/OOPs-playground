import models.*;
import payment.*;
import service.PaymentService;

public class Application {
    public static void main(String[] args) {
        Customer customer = new Customer("NK", "nk@example.com");
        PaymentService service = new PaymentService();

        // 1. Pay with Credit Card
        CreditCardDetails card = new CreditCardDetails("1234-5678-9012-3456", "123", "12/25");
        PaymentMethod creditPayment = new CreditCardPayment(card);
        service.processPayment(customer, creditPayment, 1500.0);

        // 2. Pay with UPI
        UpiDetails upi = new UpiDetails("nk@upi");
        PaymentMethod upiPayment = new UpiPayment(upi);
        service.processPayment(customer, upiPayment, 750.0);
    }
}
