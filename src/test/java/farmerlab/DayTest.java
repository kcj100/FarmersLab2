package farmerlab;

import farmerlab.animal.Horse;
import farmerlab.crop.Corn;
import farmerlab.crop.Crop;
import farmerlab.crop.TomatoPlant;
import farmerlab.farm.CropRow;
import farmerlab.farm.Farm;
import farmerlab.farm.Plot;
import farmerlab.farm.Stable;
import farmerlab.interfaces.Rideable;
import farmerlab.person.Farmer;
import farmerlab.person.Pilot;
import farmerlab.vehicle.CropDuster;
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

    @Test
    void tuesday() {

     plot.farmer.mount(plot.tractor);

     plot.tractor.harvest(plot.field);

     plot.farmer.dismount(plot.tractor);

     assertTrue(plot.field.getCropRows().get(0).getCropRow().get(0).isHasBeenHarvested());
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
    @Test
    void morningHorseFeedingTest(){
    //check if horses have been fed the right amount of EarCorn by both farmers
        for (Stable stable : plot.farm.getStables()){

         for (Horse horse : stable.getHorses()) {
            horse.eat(new Corn());
            horse.eat(new Corn());
            horse.eat(new Corn());
            }
         assertEquals(3,stable.getHorses().get(0).getStomach());

        }
    }

    @Test
    void morningBreakfastTest() {
    }
}