package farmerlab.farm;

import farmerlab.crop.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CropRowTest {

    @Test
    void addCrop() {
        Crop newCornStalk = new CornStalk(true, true);
        Crop newTomato = new TomatoPlant(false, true);
        Assertions.assertTrue(newTomato.isHasBeenFertilized() == false);

    }

    @Test
    void returnCropRow() {
        /*
        create new croprow
        assert get.croprow {should return new earcorn/tomato instance or should print new earcorn/tomato}
         */
        ArrayList<Crop> cropRow = new ArrayList<>();
        Crop tomato = new TomatoPlant(true, true);
        Crop corn = new Corn();
        Crop cornStalk = new CornStalk(true, true);
        cropRow.add(Crop);
        cropRow.add(CornStalk);
        cropRow.add

    }

    @Test
    void setCropRow() {
    }

    @Test
    void getRowNumber() {
    }
}