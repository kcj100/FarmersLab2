package farmerlab.animal;

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.NoiseMaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
Animal animal1;
Animal animal2;
   @BeforeEach
   public void setUp(){
       animal1 = new Chicken("Chicken");
       animal2 = new Horse("Horse");
   }
    @Test
    void getAnimalName() {

       assertEquals("Chicken", animal1.getAnimalName());

       assertEquals("Horse", animal2.getAnimalName());

    }

    @Test
    void setAnimalName() {
       animal1.setAnimalName("Fox");
       assertEquals("Fox", animal1.getAnimalName());

       animal2.setAnimalName("Dog");
       assertEquals("Dog", animal2.getAnimalName());
    }
    @Test
    void testImplementation() {
       assertTrue(animal1 instanceof Eater);
       assertTrue(animal1 instanceof NoiseMaker);

        assertTrue(animal2 instanceof Eater);
        assertTrue(animal2 instanceof NoiseMaker);

    }
}