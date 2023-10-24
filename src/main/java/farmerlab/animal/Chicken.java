package farmerlab.animal;

import farmerlab.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public Chicken(String animalType) {
        super(animalType);
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalType() + " makes a noise.");
    }
    public boolean gethasBeenFertilized(){
        return hasBeenFertilized;
    }
    public void setHasBeenFertilized(boolean fertilized){
        this.hasBeenFertilized = fertilized;
    }

    public void layEgg(){
        if(!hasBeenFertilized){
            System.out.println(getAnimalType() + "has laid an Edible Egg");
        }else{
            System.out.println("Can't lay egg. Egg has been fertilized.");
        }
    }

    @Override
    public Edible yield(){
        if(!hasBeenFertilized){
            return new Egg();
        }else{
            System.out.println(getAnimalType() + "has been flagged as true, can't yield egg it is fertilized");
            return null;
        }
    }
}
