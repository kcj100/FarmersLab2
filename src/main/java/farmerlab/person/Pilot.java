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


    @Override
    public void eat(Edible food) {
        food.consume();
    }

    @Override
    public boolean makeNoise() {

        return false;
    }
}
