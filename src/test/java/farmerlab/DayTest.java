package farmerlab;

import farmerlab.animal.Horse;
import farmerlab.farm.*;
import farmerlab.interfaces.Rideable;
import farmerlab.person.Farmer;
import farmerlab.vehicle.Tractor;
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

    @Test
    void tuesday() {

        plot.farmer.mount(plot.tractor);
        plot.tractor.harvest(plot.field);

        assertEquals(true, plot.farmer.equals(true));

    }

    @Test
    void morningRideTest() {
    }

    @Test
    void morningBreakfastTest() {
    }
}