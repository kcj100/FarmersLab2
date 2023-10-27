package farmerlab.farm;

import farmerlab.animal.Chicken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    private ChickenCoop chickenCoop;

    @BeforeEach
    public void setUp(){
        chickenCoop = new ChickenCoop();
    }

    @Test
    void getChickens() {
        assertEquals(0, chickenCoop.getChickens().size());
        ArrayList<Chicken> chickens = new ArrayList<>();

        Chicken chicken1 = new Chicken("Speedy", false);
        chickenCoop.addChicken(chicken1);

        assertArrayEquals(chickens.toArray(), chickenCoop.getChickens().toArray());
    }

    @Test
    void addChicken() {
        assertEquals(0, chickenCoop.getChickens().size());
        ArrayList<Chicken> chickens = new ArrayList<>();

        Chicken chicken1 = new Chicken("Big Red", true);
        chickens.add(chicken1);

        assertEquals(chickens.size(), chickenCoop.getChickens().size());
        assertEquals(chicken1, chickenCoop.getChickens().get(0));
    }
}