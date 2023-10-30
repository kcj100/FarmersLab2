package farmerlab.person;

import farmerlab.interfaces.Eater;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.NoiseMaker;
import farmerlab.interfaces.Stomach;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater, Stomach {
    private String name;
    private String favPhrase;

   protected ArrayList<Edible> stomach = new ArrayList<>();


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

    @Override
    public int getStomach() {
        return stomach.size();
    }

    @Override
    public void eat(Edible food) {
        System.out.println(name + " is eating " + food.getClass().getSimpleName().toLowerCase());

        stomach.add(food);
    }
}


