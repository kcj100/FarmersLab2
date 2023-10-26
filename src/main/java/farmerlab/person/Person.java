package farmerlab.person;

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;
    private String favPhrase;

    public Person(String name, String favPhrase) {
        this.name = name;
        this.favPhrase = favPhrase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavPhrase() {
        return favPhrase;
    }

    public void setFavPhrase(String favPhrase) {
        this.favPhrase = favPhrase;
    }
}

