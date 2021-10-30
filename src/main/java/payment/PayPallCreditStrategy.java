package payment;

public class PayPallCreditStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Items were successfully paid via PayPall! " + price + " dollars were spent.");
    }
}
