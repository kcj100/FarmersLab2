package farmerlab.animal;

import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggTest {
Egg egg1;

    @BeforeEach
    public void setUp(){
        Egg egg1 = new Egg();

    }
    @Test
   void testImplementation(){
        assertTrue(egg1 instanceof Edible);
    }

    @Test
    void testGetIfEdible(){
        assertTrue(egg1.getIfEdible());

    }

}