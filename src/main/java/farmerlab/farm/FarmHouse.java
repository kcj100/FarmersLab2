package farmerlab.farm;

import farmerlab.person.Person;

import java.util.ArrayList;

public class FarmHouse {
    private ArrayList<Person> farmHands;
    public FarmHouse() {
        farmHands = new ArrayList<>();
    }
    public ArrayList<Person> getFarmHands() {
        return farmHands;
    }

    public void setFarmHands(ArrayList<Person> farmHands) {
        this.farmHands = farmHands;
    }
    public ArrayList<Person>getFarmHand(){
        return farmHands;
    }
    public void addFarmHand(Person person){

    }

}
