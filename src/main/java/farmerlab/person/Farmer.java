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
<<<<<<< HEAD
        food.eater();
=======
        food.eat();
>>>>>>> TestBranch

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
        if (ride.isInUse()) {
            ride.setInUse(true);
            System.out.println("The ride is mounted");
        } else {
            System.out.println("Cannot mount the ride");
        }
    }

    @Override
    public void dismount(Rideable ride) {
        if (ride.isInUse()) {
            ride.setInUse(false);
            System.out.println("Dismounted from the ride.");
        } else {
            System.out.println("No ride to dismount from.");
        }
    }
}