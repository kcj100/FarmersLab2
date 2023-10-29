package farmerlab;

import farmerlab.animal.Horse;
import farmerlab.farm.CropRow;
import farmerlab.farm.Farm;
import farmerlab.farm.Plot;
import farmerlab.farm.Stable;
import farmerlab.interfaces.Rideable;
import farmerlab.person.Farmer;
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
        Plot plot = new Plot();

    }

    @Test
    void tuesday() {
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
    }

    @Test
    void morningRideTest() {
        Farmer frolian = new Farmer("frolian", "Yee-haw");
        Farmer frolianda =  new Farmer("frolianda","yuh");
        Plot plot = new Plot();

        for (Stable stable : plot.farm.getStables()) {
            List<Horse> horses = stable.getHorses(); // Get a list of all horses in the stable

            // list to keep track of which horses have been ridden
            List<Horse> riddenHorses = new ArrayList<>();

            for (Horse horse : horses) {
                if (!riddenHorses.contains(horse)) { // Check if the horse hasn't been ridden
                    frolian.mount(horse); // Frolian mounts the horse
                    riddenHorses.add(horse); // Add the horse to the list of ridden horses
                }
            }

            //  Frolianda ride the remaining horses
            for (Horse horse : horses) {
                if (!riddenHorses.contains(horse)) {
                    frolianda.mount(horse); // Frolianda mounts the horse
                    riddenHorses.add(horse);
                }
            }
        }

    }
    @Test
    void morningHorseFeeding(){
    //check if horses have been fed the right amount of EarCorn by both farmers
        for (Stable stable : plot.farm.getStables()){
        for (Horse horse : stable.getHorses()){
            assertEquals(3, horse.);
            assertEquals(3, horse.getCornEatenBy(frolianda));
        }
    }

    @Test
    void morningBreakfastTest() {
    }
}