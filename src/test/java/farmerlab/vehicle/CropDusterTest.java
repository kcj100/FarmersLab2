package farmerlab.vehicle;
import farmerlab.crop.CornStalk;
import farmerlab.crop.TomatoPlant;
import farmerlab.farm.CropRow;
import farmerlab.farm.Field;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CropDusterTest {
    @Test
    public void test_instantiation() {
        // Given
        int id = 1;
        String sound = "Buzz";

        // When
        CropDuster cropDuster = new CropDuster(id, sound);

        // Then
        assertEquals(id, cropDuster.getId());
        assertEquals(sound, cropDuster.getSound());
    }

        // Given
        @Test
        public void testWhenCropDusterIsInUseItShouldFertilizeAllCropRows() {
            // Arrange
            CropDuster cropDuster = new CropDuster(1, "Sound");
            Field field = new Field();
            CropRow cropRow1 = new CropRow();
            CropRow cropRow2 = new CropRow();
            field.addCropRow(cropRow1);
            CornStalk cornStalk = new CornStalk();
            TomatoPlant tomatoPlant = new TomatoPlant();
            cropRow1.addCrop(cornStalk);


            // Act
            cropDuster.setInUse(true);
            cropDuster.fly(field);
        // Then
        assertTrue(cornStalk.isHasBeenFertilized());
        assertFalse(tomatoPlant.isHasBeenFertilized());
    }



}
