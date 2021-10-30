package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower1 = new Flower(5, Color.Black,10,FlowerType.Rose);
    private FlowerPack pack1 = new FlowerPack(flower1,5);
    private Flower flower2 = new Flower(4,Color.Red,7,FlowerType.Tulip);
    private FlowerPack pack2 = new FlowerPack(flower2,6);
    private  FlowerBucket bucket1 = new FlowerBucket();
    private  FlowerBucket bucket2 = new FlowerBucket();
    private Store store = new Store();

    @BeforeEach
    void setUp() {
        bucket1.addFlowerPack(pack1);
        bucket1.addFlowerPack(pack2);
        bucket2.addFlowerPack(pack1);
        store.addFlowerBucket(bucket1);
        store.addFlowerBucket(bucket2);
    }
    @Test
    void search() {
        assertEquals(true,store.search(bucket2));

    }
}