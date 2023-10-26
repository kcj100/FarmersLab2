package farmerlab.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

@Test
    void getName(){

    String expectedName = "John Doe";
    Person farmer = new Farmer(expectedName, expectedName) {};

    String actualName = farmer.getName();

    assertEquals(expectedName, actualName);
}


@Test
    void setName(){

    Person person = new Farmer("Dante", "");

    String expectedName = "Dante";
    person.setName(expectedName);

    String actualName = person.getName();

    assertEquals(expectedName, actualName);
}
}

