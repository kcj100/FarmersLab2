package farmerlab.person;

import farmerlab.farm.Field;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Rideable;
import farmerlab.interfaces.Rider;
import farmerlab.vehicle.CropDuster;


public class Pilot extends Person implements Rider {
    private long licenseID;
private boolean isRiding;

    public Pilot(String name, String favPhrase, long licenseID) {
        super(name, favPhrase);
    }


    public long getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(long licenseID) {
        this.licenseID = licenseID;
    }

    public boolean isRiding() {
        return isRiding;
    }

    public void setRiding(boolean riding) {
        isRiding = riding;
    }

    public void fly(CropDuster cropDuster, Field field) {

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

        return false;
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
