package farmerlab.animal;

import farmerlab.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public Horse(String animalType){
        super(animalType);
    }

    @Override
    public void makeNoise(){
        System.out.println(getAnimalType() + " makes a noise");
    }

    @Override
    public void mount() {
        System.out.println("mounting the " + getAnimalType());
    }

    @Override
    public void dismount() {
        System.out.println("Dismounting from the " + getAnimalType());
    }
}
