package decorators;


import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + super.getPrice();
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Covered in ribbon");
    }

}