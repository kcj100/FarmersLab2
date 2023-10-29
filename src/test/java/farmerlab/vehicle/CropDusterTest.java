package farmerlab.vehicle;
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
    @Test
    public void testWhenCropDusterIsInUseItShouldFertilizeAllCropRows() {
        // Given
        CropDuster cropDuster = new CropDuster(1, "Sound");
        Field field = new Field();
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        field.addCropRow(cropRow1);
        field.addCropRow(cropRow2);

        // When
        cropDuster.setInUse(true);
        cropDuster.fly(field);

        // Then
        assertTrue(cropRow1.haFertilized());
        assertTrue(cropRow2.isFertilized());
    }

    @Test
    public void FertilizeTest(){
        /*
          private void fertilize(Field field) {
        ArrayList<CropRow> cropRows = field.getCropRows();
        for (CropRow cropRow : cropRows) {
            cropRow.fertilizeAllCrops();
        }
    }
         */
        CropDuster cropDuster = new CropDuster(1, "Sound");
        Field field = new Field();
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        field.addCropRow(cropRow1);
        field.addCropRow(cropRow2);
        cropDuster.(field);

    }
}
