package farmerlab.vehicle;

import farmerlab.interfaces.FarmVehicle;
import farmerlab.interfaces.NoiseMaker;
import farmerlab.interfaces.Rideable;

public abstract class   Vehicle implements Rideable, NoiseMaker {
    private boolean inUse = false;
    private String name;
    private int id;
    private String sound;

    public Vehicle(String name, int id, String sound) {
        this.name = name;
        this.id = id;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
    public boolean isInUse() {
        return inUse;
    }
    @Override
    public void makeNoise() {

    }
}
