package farmerlab.animal;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {
    Chicken chicken1;
    Chicken chicken2;
    @BeforeEach
    public void setUp(){
        Chicken chicken1 = new Chicken("Chicken1");
        Chicken chicken2 = new Chicken("Chicken2");
    }
    @Test
    public void testConstructor(){

        //test to return the same name
        assertEquals("Chicken1", chicken1.getAnimalName());

        //verifying the hasBeenFertilized attribute is set to false by default
        assertFalse(chicken1.gethasBeenFertilized());

        assertEquals("Chicken2", chicken2.getAnimalName());
        assertFalse(chicken2.gethasBeenFertilized());
    }
    @Test
    void testMakeNoise() {
        //
    assertEquals(true, chicken1.makeNoise());
    assertTrue(chicken1.makeNoise());

    assertEquals(true, chicken2.makeNoise());
    assertTrue(chicken2.makeNoise());
    }

    @Test
    void testGetHasBeenFertilized() {


    }

    @Test
    void testSetHasBeenFertilized() {
    }


    @Test
    void testYield() {
    }
}