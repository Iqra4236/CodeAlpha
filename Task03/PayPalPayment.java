// PayPalPayment class implementing PaymentProcessor
public class PayPalPayment implements PaymentProcessor {
    // Override method to process PayPal payment
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Simulate payment processing logic
    }
}
