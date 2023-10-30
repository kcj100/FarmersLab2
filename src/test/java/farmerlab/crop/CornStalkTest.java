package farmerlab.crop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CornStalkTest {

    @Test
    void testYield(){

        CornStalk cornStalk = new CornStalk();

        // Here you're testing yield

        // Right now you only have created a new cornstalk

        // You have to execute yield and test the result

        // Corn yieldResult = cornStalk.yield()

        // assertNotNull(yieldResult);

        // Asserting that Corn is harvested if it has been fertilized and not harvested

        // If testing an instance, you can assertNull OR assertTrue(object instaceOf classname) - assertTrue(cornStalk instanceof CornStalk)

        if (cornStalk.isHasBeenFertilized() && !cornStalk.isHasBeenHarvested()) {

            String text = "CornStalk plant has been harvested";
            Corn yieldResult = cornStalk.yield();
            assertNotNull(yieldResult);

            System.out.println("CornStalk plant has been harvested");
        } else {
            Corn yieldResult = cornStalk.yield();
            assertNull(yieldResult);
            System.out.println("CornStalk plant has not been harvested");
        }
    }

}