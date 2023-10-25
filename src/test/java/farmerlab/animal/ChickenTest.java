package farmerlab.animal;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {
    Chicken chicken1;
    Chicken chicken2;
    @Before
    public void setUp(){
        Chicken chicken1 = new Chicken("Chicken1",true);
        Chicken chicken2 = new Chicken("Chicken2", false);
    }
    @Test
    public void testConstructor(){

        //test to return the same name
        assertEquals("Chicken1", chicken1.getAnimalName());

        //verifying the hasBeenFertilized attribute is set to false by default
        assertFalse(chicken1.gethasBeenFertilized());
    }
    @Test
    void testMakeNoise() {
        //

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