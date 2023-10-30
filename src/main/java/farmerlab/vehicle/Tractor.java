package farmerlab.vehicle;

import farmerlab.farm.CropRow;
import farmerlab.farm.Field;
import farmerlab.interfaces.FarmVehicle;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {


    public Tractor(int id, String sound) {
        super( id, sound);
    }

    public void harvest(Field field) {
        if (isInUse()) {
            System.out.println("The farmer is currently using the tractor to harvest the field.");
            ArrayList<CropRow> cropRows = field.getCropRows();

            for (CropRow cropRow : cropRows) {
                cropRow.harvestAllCrops();
            }
        } else {
            System.out.println("The tractor cannot be used for harvesting the field because there is no rider available.");
        }
    }



    public void operate(boolean inUse) {
        setInUse(inUse);
    }
}

