package farmerlab.animal;


public class Animal {

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public abstract void makeNoise();

    @Override
    public void eat(Edible food){
        System.out.println(animalName + "is eating " + food.getClass().getSimpleName().toLowerCase());
    }


}
