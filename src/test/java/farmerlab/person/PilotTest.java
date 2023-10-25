package farmerlab.person;

import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {



   @Test
   void eat(){
       Pilot pilot = new Pilot("John Doe", "Get ready for flight", 225565);
       Edible food = new Edible() {};

       pilot.eat(food);

       assertTrue(food.isEaten());
   }




    @Test
    void makeNoise(){
    Pilot pilot = new Pilot("Dante", "Ready for takeoff", 5554210);
    assertTrue(pilot.makeNoise());

    }


}