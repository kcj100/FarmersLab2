package farmerlab.person;

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

