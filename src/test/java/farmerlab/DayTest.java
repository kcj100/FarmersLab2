package farmerlab;

import farmerlab.animal.Horse;
<<<<<<< HEAD
import farmerlab.farm.*;
import farmerlab.interfaces.Rideable;
import farmerlab.person.Farmer;
import farmerlab.vehicle.Tractor;
=======
import farmerlab.farm.CropRow;
import farmerlab.farm.Farm;
import farmerlab.farm.Plot;
import farmerlab.farm.Stable;
import farmerlab.interfaces.Rideable;
import farmerlab.person.Farmer;
>>>>>>> TestBranch
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

        cropRow.addCrop(Tomatoplant); //Added a cropRow to CropRows
        field.addCropRow(cropRow); //then proceeded to add the cropRow into field

        cropRow1.addCrop((CornStalk));
        field.addCropRow(cropRow);

        froilanda.mount(cropDuster); //had the pilot mount the cropDuster
        cropDuster.setInUse(true); //It should be assumed that it is in use when cropDuster is mounted.
        cropDuster.fly(field); // Pilot flew cropDuster over field


        assertTrue(field.getCropRows().get(0).getCropRow().get(0).isHasBeenFertilized());
        /*
        We had entry to the field to gain access to cropRows
         accessed the cropRow with the get() method
         accessed a plant within that cropRow and ensured it was fertilized
        */
        assertTrue(field.getCropRows().get(1).getCropRow().get(0).isHasBeenFertilized());





    }

    @Test
    void tuesday() {
<<<<<<< HEAD

        plot.farmer.mount(plot.tractor);
        plot.tractor.harvest(plot.field);

        assertEquals(true, plot.farmer.equals(true));

=======
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        farm.addStable(stable1);
        Horse horse1 = new Horse("Speed");
        Horse horse2 = new Horse("Shadow");
        stable1.addHorse(horse1);
        stable1.addHorse(horse2);
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        farm.getFarmHouse()
>>>>>>> TestBranch
    }

    @Test
    void morningRideTest() {
        Farmer frolian = new Farmer("frolian", "Yee-haw");
        Farmer frolianda =  new Farmer("frolianda","yuh");
        Plot plot = new Plot();

        int counter = 0;

        for (Stable stable : plot.farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                if (counter % 2 == 0) { // If the counter is even, Farmer mounts the horse
                    frolian.mount(horse); // Farmer rides the horse
                } else {
                    // If the counter is odd, Pilot mounts the horse
                    frolianda.mount(horse); // Pilot rides the horse
                }
                counter++; // Increment the counter for the next iteration
            }
        }


    }
//    @Test
//    void morningHorseFeeding(){
//    //check if horses have been fed the right amount of EarCorn by both farmers
//        for (Stable stable : plot.farm.getStables()){
//        for (Horse horse : stable.getHorses()){
//            assertEquals(3, horse.);
//            assertEquals(3, horse.getCornEatenBy(frolianda));
//        }
//    }

    @Test
    void morningBreakfastTest() {
    }
}