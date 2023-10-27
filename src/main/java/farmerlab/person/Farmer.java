package farmerlab.person;

import farmerlab.animal.Horse;
import farmerlab.crop.Crop;
import farmerlab.interfaces.*;
import farmerlab.vehicle.Tractor;

public class Farmer extends  Person implements Botanist, Rider {


    public Farmer(String name, String favPhrase) {
        super(name, favPhrase);
    }

    @Override
    public void eat(Edible food) {
        food.getIfEdible();

    }

    @Override
    public void makeNoise() {
        System.out.println("This Farmer makes noise");

    }

    @Override
    public Crop plant(Crop crop) {
        return null;
    }

    @Override
    public void mount(Rideable ride) {

        if (ride instanceof FarmVehicle) {

            if (ride instanceof Tractor) {
                if (!ride.isInUse()) {
                    ride.setInUse(true);
                    System.out.println("The ride is mounted");

                    ((Tractor) ride).operate(true);
                    System.out.println("Tractor is mounted");
                } else {
                    System.out.println("The tractor is in use and can not be mounted");
                }

            } else if (ride instanceof Horse) {
                if (!ride.isInUse()) {
                    ride.setInUse(true);
                    System.out.println("The horse is mounted");
                } else {
                    System.out.println("The horse is in use and can not be mounted");
                }
            }

        }
    }

    @Override
    public void dismount(Rideable ride) {
        if (ride instanceof FarmVehicle) {

            if (ride instanceof Tractor) {
                if (ride.isInUse()) {
                    ride.setInUse(false);
                    System.out.println("The ride is dismounted");

                    ((Tractor) ride).operate(false);
                    System.out.println("Tractor is dismounted");
                } else {
                    System.out.println("The tractor is not in use and can be mounted");
                }

            } else if (ride instanceof Horse) {
                if (ride.isInUse()) {
                    ride.setInUse(false);
                    System.out.println("The horse is dismounted");
                } else {
                    System.out.println("The horse is not in use and can be mounted");
                }
            }

        }
    }
}