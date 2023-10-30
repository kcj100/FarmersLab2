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

        plot.cropRow.addCrop(plot.tomatoPlant1); //Added a cropRow to CropRows
        plot.field.addCropRow(plot.cropRow); //then proceeded to add the cropRow into field

        plot.cropRow2.addCrop((plot.cornStalk1));
        plot.field.addCropRow(plot.cropRow2);

        plot.pilot.mount(plot.cropDuster); //had the pilot mount the cropDuster
        plot.cropDuster.setInUse(true); //It should be assumed that it is in use when cropDuster is mounted.
        plot.cropDuster.fly(plot.field); // Pilot flew cropDuster over field


        assertTrue(plot.field.getCropRows().get(0).getCropRow().get(0).isHasBeenFertilized());
        /*
        We had entry to the field to gain access to cropRows
         accessed the cropRow with the get() method
         accessed a plant within that cropRow and ensured it was fertilized
        */
        assertTrue(plot.field.getCropRows().get(1).getCropRow().get(0).isHasBeenFertilized());





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