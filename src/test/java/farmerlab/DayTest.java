package farmerlab;

import farmerlab.animal.Horse;
import farmerlab.crop.CornStalk;
import farmerlab.crop.Crop;
import farmerlab.crop.TomatoPlant;
import farmerlab.farm.*;
import farmerlab.interfaces.Rideable;
import farmerlab.person.Farmer;
import farmerlab.person.Pilot;
import farmerlab.vehicle.CropDuster;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {
Plot plot = new Plot();
    @Test
    void sunday() {
        plot.cropRow.addCrop(plot.cornStalk1); // Plant  in the first CropRow
        plot.cropRow2.addCrop(plot.tomatoPlant1); // Plant  in the first CropRow
        plot.cropRow3.addCrop(plot.cornStalk2); // Plantin the first CropRow


        assertEquals(1, plot.cropRow.getCropRow().size());
        assertEquals(1, plot.cropRow2.getCropRow().size());
        assertEquals(1, plot.cropRow3.getCropRow().size());

    }


    @Test
    void monday() {

        CropRow cropRow = new CropRow();
        CropRow cropRow1 = new CropRow();
        Crop Tomatoplant = new TomatoPlant();
        Crop CornStalk = new CornStalk();
        CropDuster cropDuster = new CropDuster(1, "wiiiinngg");
        Field field = new Field();
        Pilot froilanda = new Pilot("Dawn", "geronimo", 123);

        cropRow.addCrop(Tomatoplant);
        field.addCropRow(cropRow);

        cropRow1.addCrop((CornStalk));
        field.addCropRow(cropRow);

        froilanda.mount(cropDuster);
        cropDuster.setInUse(true); //It should be assumed that it is in use when cropDuster is mounted.
        cropDuster.fly(field);


        assertTrue(field.getCropRows().get(0).getCropRow().get(0).isHasBeenFertilized());
        assertTrue(field.getCropRows().get(1).getCropRow().get(0).isHasBeenFertilized());





    }

//    @Test
//    void tuesday() {
//        Farm farm = new Farm();
//        Stable stable1 = new Stable();
//        farm.addStable(stable1);
//        Horse horse1 = new Horse("Speed");
//        Horse horse2 = new Horse("Shadow");
//        stable1.addHorse(horse1);
//        stable1.addHorse(horse2);
//        CropRow cropRow1 = new CropRow();
//        CropRow cropRow2 = new CropRow();
//        farm.getFarmHouse()
//    }

    @Test
    void morningRideTest() {
    }

    @Test
    void morningBreakfastTest() {
    }
}