package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower = new Flower(5, Color.Black,10, FlowerType.Rose);
    @Test
    void getSepalLength() {
        assertEquals(5,flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertEquals(Color.Black,flower.getColor());
    }

    @Test
    void getPrice() {
        assertEquals(10,flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.Rose,flower.getFlowerType());
    }}