package farmerlab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
Horse horse1;
Horse horse2;
   @BeforeEach
   public void setUp(){
       Horse horse1 = new Horse("Horse1 1");
       Horse horse2 = new Horse("Horse2");
   }
  @Test
  void testConstructor(){
       assertEquals("horse1", horse1.getAnimalName());
       assertEquals("horse2",horse2.getAnimalName());
  }
    @Test
    public void testMakeNoise() {
    }

    @Test
    void testIsInUse() {
       assertFalse(horse1.isInUse());
       assertFalse(horse2.isInUse());
    }

    @Test
    void testSetInUse() {
       horse1.setInUse(true);
       assertTrue(horse1.isInUse());

       horse2.setInUse(false);
       assertFalse(horse2.isInUse());
    }
}