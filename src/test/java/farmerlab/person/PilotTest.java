package farmerlab.person;

import farmerlab.crop.Tomato;
import farmerlab.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {



   @Test
   void eat(){
       Pilot pilot = new Pilot("James", "Get ready for flight", 225565);

       Tomato food = new Tomato();

       pilot.eat(food);

       assertTrue(food.getIfEdible());


   }



@Test
    void testGetLicenseID(){

    long expectedLicenseID = 5554210;
    Pilot license = new Pilot("Dante", "Ready for takeoff", expectedLicenseID);

    long actualLicenseID = license.getLicenseID();

    assertEquals(expectedLicenseID, actualLicenseID);
}

@Test
    void setLicenseID(){

    long expectedLicenseID = 254878;
       Pilot license = new Pilot("Jack", "Blastoff!!", expectedLicenseID);

    license.setLicenseID(expectedLicenseID);

    long actualLicenseID = license.getLicenseID();
    assertEquals(expectedLicenseID, actualLicenseID);
}

@Test
void    isRiding(){

    Pilot  pilot = new Pilot("Tyrone", "Lets ride", 182571);

    pilot.setRiding(true);
    assertTrue(pilot.isRiding());

    pilot.setRiding(false);
    assertFalse(pilot.isRiding());
}
}
