package farmerlab.vehicle;

import farmerlab.interfaces.FarmVehicle;
import farmerlab.interfaces.NoiseMaker;
import farmerlab.interfaces.Rideable;

public abstract class   Vehicle implements Rideable, NoiseMaker {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {

    }
}
