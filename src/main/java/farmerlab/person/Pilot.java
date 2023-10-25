package farmerlab.person;

import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Rideable;
import farmerlab.interfaces.Rider;


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

    @Override
    public void eat(Edible food) {
        food.eat();
    }

    @Override
    public boolean makeNoise() {

        return false;
    }

    @Override
    public void mount(Rideable ride) {

    }

    @Override
    public void dismount(Rideable ride) {

    }
}
