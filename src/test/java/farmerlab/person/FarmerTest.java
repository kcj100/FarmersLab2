package farmerlab.person;

import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void farmerName(){
        String expectedName = "Dante";
        Farmer farmer = new Farmer(expectedName);

        assertEquals(expectedName, farmer.getName());
    }

    @Test
    void testEat() {
        Farmer farmer = new Farmer("Dante");
        Edible food = new Edible() {};

        farmer.eat(food);

        assertTrue(food.isConsumed());
    }

    @Test
    void testMakeNoise() {
        Farmer farmer = new Farmer("John");
        assertTrue(farmer.makeNoise());
    }



}



