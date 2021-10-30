package flowerstore;

import lombok.*;

@Setter@Getter@AllArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private Color color;
    private double price;
    private FlowerType flowerType;
    public Flower() {
    }
    public boolean equals(Flower obj) {
        return this.getSepalLength() == obj.getSepalLength() && this.getColor()==obj.getColor() &&
                this.getPrice() == obj.getPrice() && this.getFlowerType() == obj.getFlowerType();
    }


    @Override
    public void getDescription() {
        System.out.println("" + color + " " + flowerType + " sepal length is: " + sepalLength +
                ", price: " + price);
    }
}
