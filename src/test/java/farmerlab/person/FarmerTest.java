package farmerlab.person;

import farmerlab.crop.Tomato;
import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void farmerName() {
        //checks to see if farmer name works

        String expectedName = "Dante";
        String expectedPhrase = "The roosters are singing";
        Farmer farmer = new Farmer(expectedName, expectedPhrase);

        assertEquals(expectedName, farmer.getName());
    }

    @Test
    void testEat() {
       //checks to see if eat method works
        Farmer farmer = new Farmer("Dante", "The roosters are singing");
        Tomato food = new Tomato() {
        };

        farmer.eat(food);

        assertTrue(food.getIfEdible());
    }
}





