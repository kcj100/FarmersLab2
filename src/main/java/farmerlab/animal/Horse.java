package farmerlab.animal;

import farmerlab.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public Horse(String animalName){
        super(animalName);
    }

    @Override
    public void makeNoise(){
        System.out.println(getAnimalName() + " makes a noise");
    }

    @Override
    public void isRideable() {
        System.out.println(getAnimalName() + " is rideable.");
    }

}
