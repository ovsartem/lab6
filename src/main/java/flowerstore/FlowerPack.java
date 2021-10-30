package flowerstore;
import lombok.*;

@Getter@Setter
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount =amount;
    }
    @Override
    public double getPrice(){
        return amount*flower.getPrice();
    }

    @Override
    public void getDescription() {
        System.out.println("FlowerPack{" +
                "amount=" + amount +
                ", flower=" + flower +
                '}');
    }
    public boolean equals(FlowerPack obj) {
        return this.getFlower().equals(obj.getFlower()) && this.getAmount()==obj.getAmount();
    }}
