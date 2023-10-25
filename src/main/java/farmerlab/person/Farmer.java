package farmerlab.person;

import farmerlab.interfaces.Edible;

public class Farmer extends  Person{


    public Farmer(String name) {
        super(name);

    }


    @Override
    public void eat(Edible food) {
        food.consume();

    }


    @Override
    public boolean makeNoise() {
        System.out.println("This Farmer makes noise");
        return false;
    }
}