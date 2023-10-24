package farmerlab.animal;


public class Animal {

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    private String animalType;

    public Animal(String animalType){
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public abstract void makeNoise();

    @Override
    public void eat(Edible food){
        System.out.println(animalType + "is eating " + food.getName());
    }


}
