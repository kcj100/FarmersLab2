package farmerlab.crop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoPlantTest {

    @Test
    void testYield() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        //if the tomato plant has been fertilized and harvested the yield method should produce tomatoes
        if (tomatoPlant.isHasBeenFertilized() && !tomatoPlant.isHasBeenHarvested()) {

            String text = "CornStalk plant has been harvested";
            Tomato yieldResult = tomatoPlant.yield();
            assertNotNull(yieldResult);

            System.out.println("CornStalk plant has been harvested");
        } else {
            Tomato yieldResult = tomatoPlant.yield();
            assertNull(yieldResult);
            System.out.println("CornStalk plant has not been harvested");
        }


    }
}