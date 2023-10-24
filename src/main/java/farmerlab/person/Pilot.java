package farmerlab.person;

import farmerlab.interfaces.Edible;

public class Pilot extends Person {
    private boolean canFly;

    public Pilot(String name) {
        super(name);
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot("John Doe");
        System.out.println("Pilot's name: " + pilot.getName());
        System.out.println("Can the pilot fly? " + pilot.canFly());
    }
}



    @Override
    public void eat(Edible food) {

    }

    @Override
    public void makeNoise() {

    }
}
