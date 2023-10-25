package farmerlab.vehicle;

import farmerlab.interfaces.FarmVehicle;
import farmerlab.interfaces.NoiseMaker;
import farmerlab.interfaces.Rideable;

public abstract class   Vehicle implements Rideable, NoiseMaker {
    private boolean inUse = false;

    private int id;
    private String sound;

    public Vehicle( int id, String sound) {

        this.id = id;
        this.sound = sound;
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
        System.out.println(getSound());
    }
}
