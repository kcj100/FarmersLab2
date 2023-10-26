package farmerlab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
Animal animal1;
Animal animal2;
   @BeforeEach
   public void setUp(){
       Animal animal1 = new Chicken("Chicken");
       Animal animal2 = new Horse("Horse");
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
    void eat() {
    }
}