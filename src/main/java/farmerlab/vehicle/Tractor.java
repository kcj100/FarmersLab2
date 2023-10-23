package farmerlab.vehicle;

import farmerlab.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {
    public Tractor(String name) {
        super(name);
    }

    @Override
    public void operate() {

    }
}
