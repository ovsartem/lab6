import decorators.BasketDecorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import delivery.PostDeliverySrategy;
import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPallCreditStrategy;
import payment.Payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    private Order order = new Order();
    private Flower flower1 = new Flower(5, Color.Black,10, FlowerType.Rose);
    private FlowerPack pack1 = new FlowerPack(flower1,5);
    private Flower flower2 = new Flower(4,Color.Red,7,FlowerType.Tulip);
    private FlowerPack pack2 = new FlowerPack(flower2,6);
    private FlowerBucket bucket1 =  new FlowerBucket();
    private FlowerBucket bucket2 =  new FlowerBucket();


    @BeforeEach
    void setUp1() {
        bucket1.addFlowerPack(pack1);
        bucket1.addFlowerPack(pack2);
        bucket1.addFlowerPack(pack1);
        bucket2.addFlowerPack(pack1);
    }
    private Item updatedBucket1 = new BasketDecorator(new PaperDecorator(new RibbonDecorator(bucket1)));
    private Item updatedBucket2 = new PaperDecorator(new RibbonDecorator(bucket2));
    private Delivery delivery = new DHLDeliveryStrategy();
    private Payment payment = new PayPallCreditStrategy();
    @BeforeEach
    void setUp2() {
        order.addItem(updatedBucket1);
        order.addItem(updatedBucket2);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);
        order.processOrder();
    }

    @Test
    void calculatePrice() {
        assertEquals(order.CalculatePrice(),302);
    }

}