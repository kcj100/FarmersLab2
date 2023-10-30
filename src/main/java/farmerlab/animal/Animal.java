package farmerlab.animal;

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.NoiseMaker;
import farmerlab.interfaces.Stomach;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater, Stomach {

    private String animalName;
    protected List<Edible> stomach = new ArrayList<>();

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

    @Override
    public int getStomach() {
        return stomach.size();
    }

    @Override
    public void eat(Edible food){
<<<<<<< Updated upstream
        System.out.println(animalName + " is eating " + food.getClass().getSimpleName().toLowerCase());
        stomach.add(food);
    }



}
=======
        System.out.println(animalName + "is eating " + food.getClass().getSimpleName().toLowerCase());
    }


}
>>>>>>> Stashed changes
