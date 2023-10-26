package farmerlab.farm;

import farmerlab.crop.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CropRowTest {

    @Test
    void TestaddCrop() {
        Crop newCornStalk = new CornStalk();
        Crop newTomato = new TomatoPlant();
        Assertions.assertTrue(newTomato.isHasBeenFertilized() == false);

    }

    @Test
    void testFertilizeAllCrops() {

        ArrayList<Crop> cropRow = new ArrayList<>();
        Crop tomato = new TomatoPlant();
        Crop cornStalk = new CornStalk();
        //Crop corn = new Corn();
        cropRow.add(cornStalk);
        cropRow.add(tomato);

        CropRow crops = new CropRow();
        crops.setCropRow(cropRow);

        crops.fertilizeAllCrops();

//        for (Crop crop : cropRow){
//            assertTrue(crop.isHasBeenFertilized());
//        }


    }

    @Test
    void testHarvestAllCrops() {

        ArrayList<Crop> cropRow = new ArrayList<>();
        Crop tomato = new TomatoPlant();
        Crop cornStalk = new CornStalk();
        //Crop corn = new Corn();
        cropRow.add(cornStalk);
        cropRow.add(tomato);

        CropRow crops = new CropRow();
        crops.setCropRow(cropRow);

        crops.harvestAllCrops();

//        for (Crop crop : cropRow){
//            assertTrue(crop.isHasBeenHarvested());
//        }
    }


}