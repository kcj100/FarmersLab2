package farmerlab.person;

import farmerlab.crop.Crop;
import farmerlab.interfaces.Botanist;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Rideable;
import farmerlab.interfaces.Rider;

public class Farmer extends  Person implements Botanist, Rider {


    public Farmer(String name, String favPhrase) {
        super(name, favPhrase);
    }

    @Override
    public void eat(Edible food) {
        food.eat();

    }


    @Override
    public boolean makeNoise() {
        System.out.println("This Farmer makes noise");
        return false;
    }

    @Override
    public Crop plant(Crop crop) {
        return null;
    }

    @Override
    public void mount(Rideable ride) {

    }

    @Override
    public void dismount(Rideable ride) {

    }
}