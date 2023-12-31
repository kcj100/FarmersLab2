package farmerlab.vehicle;

import farmerlab.farm.CropRow;
import farmerlab.farm.Field;
import farmerlab.interfaces.FarmVehicle;

import java.util.ArrayList;

public class CropDuster extends Aircraft implements FarmVehicle {

    public CropDuster( int id, String sound) {

        super( id, sound);
    }



    @Override
    public void fly(Field field) {
        if (isInUse()) {
        System.out.println("The crop duster is currently in operation with a pilot for field fertilization.");
        fertilize(field);
    } else {
        System.out.println("Fertilization cannot be performed on the field with the crop duster, as there is no available pilot.");
    }

    }


    private void fertilize(Field field) {
        ArrayList<CropRow> cropRows = field.getCropRows();
        for (CropRow cropRow : cropRows) {
            cropRow.fertilizeAllCrops();
        }
    }


    @Override
    public void operate(boolean inUse) {
            setInUse(inUse);
        }
    }





