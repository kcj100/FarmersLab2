package farmerlab.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {

    @Test
    void canFly() {
        Pilot pilot = new Pilot("Dante");
        pilot.canFly();
        boolean expectedResult = true;
        boolean actualResult = pilot.canFly();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void setCanFly() {


    }
}