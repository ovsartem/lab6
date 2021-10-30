package decorators;


import flowerstore.Item;

public abstract class ItemDecorator extends Item {
    private Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public void getDescription() {
        item.getDescription();
    }
}