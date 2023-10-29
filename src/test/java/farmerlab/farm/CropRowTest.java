package farmerlab.farm;

import farmerlab.crop.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CropRowTest {

    @Test
    void testAddCrop() {
        Crop newCornStalk = new CornStalk();
        Crop newTomato = new TomatoPlant();
        Assertions.assertTrue(newTomato.isHasBeenFertilized() == false);

    }

    @Test
    void testFertilizeAllCrops() {

        CropRow cropRow = new CropRow(); //Creating a new cropRow
        Crop tomato = new TomatoPlant(); //Creating new crops
        Crop cornStalk = new CornStalk();
        Crop tomato1 = new TomatoPlant();
        cropRow.addCrop(tomato); //Adding crops to the cropRow
        cropRow.addCrop(tomato1);
        cropRow.addCrop(cornStalk);

//Looped through the cropRow in order to fertilze all crops
        for (Crop crop : cropRow.getCropRow()){
            cropRow.fertilizeAllCrops();
            assertTrue(crop.isHasBeenFertilized()); //Ensured the crops has been fertilized
        }


    }

    @Test
    void testHarvestAllCrops() {
        CropRow cropRow = new CropRow();
        Crop tomato = new TomatoPlant();
        Crop cornStalk = new CornStalk();
        Crop tomato1 = new TomatoPlant();
        cropRow.addCrop(tomato);
        cropRow.addCrop(tomato1);
        cropRow.addCrop(cornStalk);

        cropRow.fertilizeAllCrops();
        cropRow.harvestAllCrops();


        for (Crop crop : cropRow.getCropRow()){
            assertTrue(crop.isHasBeenHarvested());
        }
    }



}