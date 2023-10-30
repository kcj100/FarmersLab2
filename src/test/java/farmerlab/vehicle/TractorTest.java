package farmerlab.vehicle;

import farmerlab.crop.CornStalk;
import farmerlab.farm.CropRow;
import farmerlab.farm.Field;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TractorTest {


    @Test
    public void testTractorConstructor() {
        int id = 1;
        String sound = "Vroom";
        Tractor tractor = new Tractor(id, sound);

        assertEquals(id, tractor.getId());
        assertEquals(sound, tractor.getSound());
        assertFalse(tractor.isInUse()); // Assuming the initial state is not in use
    }


    @Test
    public void testHarvestMethod_WhenInUse() {
        // Create a mock Field and CropRow
        Field field = new Field();
        CropRow cropRow = new CropRow();
        field.addCropRow(cropRow);
        CornStalk cornStalk = new CornStalk();
        cropRow.addCrop(cornStalk);


        Tractor tractor = new Tractor(1, "Vroom");
        tractor.harvest(field);
        assertFalse(cornStalk.isHasBeenHarvested());



    }
}

