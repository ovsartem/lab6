package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public void pay(double price) {
        System.out.println("Items were successfully paid via card!"+ price + " dollars were spent.");
    }
}
