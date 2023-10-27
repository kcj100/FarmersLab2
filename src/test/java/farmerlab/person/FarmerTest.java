package farmerlab.person;

import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void farmerName() {
        String expectedName = "Dante";
        String expectedPhrase = "The roosters are singing";
        Farmer farmer = new Farmer(expectedName, expectedPhrase);

        assertEquals(expectedName, farmer.getName());
    }

    @Test
    void testEat() {
        Farmer farmer = new Farmer("Dante", "The roosters are singing");
        Edible food = new Edible() {
        };

        farmer.eat(food);

        assertTrue(food.getIfEdible());
    }
}





