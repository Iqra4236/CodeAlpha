
// CreditCardPayment class implementing PaymentProcessor
public class CreditCardPayment implements PaymentProcessor {
    // Override method to process credit card payment
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Simulate payment processing logic
    }
}