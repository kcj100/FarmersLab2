package farmerlab.farm;

import farmerlab.person.Farmer;
import farmerlab.person.Person;
import farmerlab.person.Pilot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FarmHouseTest {

    private FarmHouse farmHouse;
    @BeforeEach
    public void setUp(){
        farmHouse = new FarmHouse();
    }


    @Test
    void getFarmHands() {
        assertEquals(0, farmHouse.getFarmHands().size());

        ArrayList<Person> people = new ArrayList<>();

        Person person1 = new Pilot("John","Yeha!", 5768);
        people.add(person1);

        farmHouse.addFarmHand(person1);
        assertEquals(people.size(), farmHouse.getFarmHands().size());
        assertArrayEquals(people.toArray(),farmHouse.getFarmHands().toArray());



    }

    @Test
    void addFarmHand() {

        assertEquals(0, farmHouse.getFarmHands().size());

        Person person = new Farmer("Wick","GoshDarn");
        farmHouse.addFarmHand(person);

        assertEquals(1, farmHouse.getFarmHands().size());
        assertEquals(person, farmHouse.getFarmHands().get(0));

    }
}