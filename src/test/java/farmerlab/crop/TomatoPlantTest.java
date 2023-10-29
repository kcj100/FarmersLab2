package farmerlab.crop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoPlantTest {

    @Test
    void testYield(){
        Corn corn = TomatoPlant.yield();

        // Asserting that Corn is harvested if it has been fertilized and not harvested
        if (TomatoPlant.isHasBeenFertilized() && !TomatoPlant.isHasBeenHarvested()) {
            assert corn != null;
            System.out.println("CornStalk plant has been harvested");
        } else {
            assert corn == null;
            System.out.println("CornStalk plant has not been harvested");
        }
    }

}