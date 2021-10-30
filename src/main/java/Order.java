import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;

import java.util.ArrayList;
import lombok.Getter;

@Getter
public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentMethod){
        payment = paymentMethod;
    }
    public void setDeliveryStrategy(Delivery deliveryMethod){
        delivery = deliveryMethod;
    }
    public double CalculatePrice(){
        double price = 0;
        int i;
        for (i=0;i< items.size();i++){
            price+=items.get(i).getPrice();
        }
        return price;
    }

    public void processOrder(){
        payment.pay(this.CalculatePrice());
        delivery.deliver(items);
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }}




