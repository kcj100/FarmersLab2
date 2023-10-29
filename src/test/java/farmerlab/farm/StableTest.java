package farmerlab.farm;

import farmerlab.animal.Horse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StableTest {

    private Stable stable;

    @BeforeEach
    public void setUp(){
        stable = new Stable();
    }

    @Test
    void getHorses() {
        assertEquals(0, stable.getHorses().size());
        ArrayList<Horse> horses = new ArrayList<>();

        Horse horse1 = new Horse("Speed");
        horses.add(horse1);
        stable.addHorse(horse1);

        assertArrayEquals(horses.toArray(), stable.getHorses().toArray());
    }

    @Test
    void addHorse() {
        assertEquals(0, stable.getHorses().size());
        ArrayList<Horse> horsesArray = new ArrayList<>();

        Horse horse1 = new Horse("Shadow");
        horsesArray.add(horse1);
        stable.addHorse(horse1);

        assertEquals(stable.getHorses(), stable.getHorses().size());
        assertEquals(horse1, stable.getHorses().get(0));
    }
}