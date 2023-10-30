package farmerlab.animal;

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

    public void makeNoise(){
        System.out.println(getAnimalName() + " make's a noise");
    }

//    public boolean getMakeNoise(){
//    }

    @Override
    public void eat(Edible food){
<<<<<<< Updated upstream
        System.out.println(animalName + " is eating " + food.getClass().getSimpleName().toLowerCase());
    }



}
=======
        System.out.println(animalName + "is eating " + food.getClass().getSimpleName().toLowerCase());
    }


}
>>>>>>> Stashed changes
