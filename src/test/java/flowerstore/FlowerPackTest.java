package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower = new Flower(5, Color.Black,10, FlowerType.Rose);
    private FlowerPack pack = new FlowerPack(flower,5);

    @Test
    void getPrice() {
        assertEquals(50,pack.getPrice());
    }
}