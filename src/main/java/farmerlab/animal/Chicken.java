package farmerlab.animal;

import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized = false;

    public Chicken(String animalName) {
        super(animalName);
    }

    public boolean gethasBeenFertilized(){
        return hasBeenFertilized;
    }
    public void setHasBeenFertilized(boolean fertilized){
        this.hasBeenFertilized = fertilized;
    }

    @Override
    public Edible yield(){
        if(!hasBeenFertilized){
            System.out.println(getAnimalName() + "has laid an Edible Egg");
            hasBeenFertilized = true;
            return new Egg();

        }else{
            System.out.println(getAnimalName() + "has been flagged as true, can't yield egg it is fertilized");
            return null;
        }
    }


}
