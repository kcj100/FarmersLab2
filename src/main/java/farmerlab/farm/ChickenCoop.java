package farmerlab.farm;

import farmerlab.animal.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickens;

    public ChickenCoop(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    public ChickenCoop(){
        chickens = new ArrayList<>();
    }

    public ArrayList<Chicken> getChickens(){
        return chickens;
    }
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }
}
