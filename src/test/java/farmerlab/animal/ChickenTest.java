package farmerlab.animal;


import farmerlab.interfaces.Edible;
import farmerlab.interfaces.NoiseMaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {
    Chicken chicken1;
    Chicken chicken2;
    @BeforeEach
    public void setUp(){
        chicken1 = new Chicken("Chicken1");
        chicken2 = new Chicken("Chicken2");
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
//    @Test
//    void testMakeNoise() {
//
//    assertEquals(true, chicken1 instanceof NoiseMaker);
//    assertTrue(chicken1 instanceof NoiseMaker);
//
//    assertEquals(true, chicken2.makeNoise());
//    assertTrue(chicken2.makeNoise());
//    }

    @Test
    void testGetHasBeenFertilized() {
        assertFalse(chicken1.gethasBeenFertilized());
    }

    @Test
    void testSetHasBeenFertilized() {
        chicken1.setHasBeenFertilized(true);
        assertTrue(chicken1.gethasBeenFertilized());
    }

    @Test
    void testYield() {
        //Fertilize Chicken
        chicken1.setHasBeenFertilized(true);

        //chicken cannot yield egg when fertilized
        Edible egg = chicken1.yield();

        assertNull(egg);
        assertTrue(chicken1.gethasBeenFertilized());

        chicken2.setHasBeenFertilized(false);
        Edible egg2 = chicken2.yield();
        assertNotNull(egg2);
        assertFalse(chicken2.gethasBeenFertilized());

    }
}