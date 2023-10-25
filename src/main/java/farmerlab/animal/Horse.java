package farmerlab.animal;

import farmerlab.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    private boolean inUse;
    public Horse(String animalName){
        super(animalName);
    }



    @Override
    public boolean isInUse() {
        return inUse;
    }

    @Override
    public void setInUse(boolean available) {

    }
}
