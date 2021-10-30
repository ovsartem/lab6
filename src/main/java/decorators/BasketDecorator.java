package decorators;


import flowerstore.Item;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Put in basket");
    }
}