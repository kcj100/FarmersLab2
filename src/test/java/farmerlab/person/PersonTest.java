package farmerlab.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

@Test
    void getName(){

    String expectedName = "John Doe";
    Farmer farmer = new Farmer(expectedName);

    String actualName = farmer.getName();

    assertEquals(expectedName, actualName);
}


@Test
    void setName(){

    Farmer farmer = new Farmer("Dante");

    String expectedName = "Dante";
    farmer.setName(expectedName);

    String actualName = farmer.getName();

    assertEquals(expectedName, actualName);
}
}

