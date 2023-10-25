package farmerlab.animal;

import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggTest {

    @Test
   void testIfEdible(){
        Egg egg = new Egg();
        assertTrue(egg instanceof Edible);
    }


}