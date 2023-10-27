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

    public void addFarmHand(Person person){
        farmHands.add(person);

    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "farmHands=" + farmHands +
                '}';
    }
}
