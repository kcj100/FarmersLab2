package farmerlab.person;

import farmerlab.animal.Horse;
import farmerlab.farm.Field;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.FarmVehicle;
import farmerlab.interfaces.Rideable;
import farmerlab.interfaces.Rider;
import farmerlab.vehicle.CropDuster;
import farmerlab.vehicle.Tractor;


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
    public void makeNoise() {
        System.out.println("This pilot makes noise");

    }

    @Override
    public void mount(Rideable ride) {
        if (ride instanceof FarmVehicle) {//checks to see if the ride is an instance of farmvehicle

            if (ride instanceof CropDuster) { //checks if ride is an instance of cropduster as well.
                if (ride.isInUse()!=true) {//checks to see if cropduster is in use
                    ride.setInUse(true);//sets the inuse method to true

                    System.out.println("CropDuster is mounted");
                } else {
                    System.out.println("The CropDuster is in use and can not be mounted");
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
        if (ride instanceof FarmVehicle) {//checks if the ride is an instance of farmvehicle

            if (ride instanceof CropDuster) {//checks if ride is instance of cropduster
                if (ride.isInUse()!=false//checks to see if the cropduster is in use

                ) {
                    ride.setInUse(false);//sets the in use to false

                    System.out.println("The CropDuster is dismounted");
                } else {
                    System.out.println("The CropDuster is not in use and can be mounted");
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
