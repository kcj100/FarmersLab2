package farmerlab;

import farmerlab.animal.Horse;
import farmerlab.farm.CropRow;
import farmerlab.farm.Farm;
import farmerlab.farm.Plot;
import farmerlab.farm.Stable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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