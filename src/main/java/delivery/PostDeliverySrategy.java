package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliverySrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Items was successfully delivered by Post!");
    }
}
