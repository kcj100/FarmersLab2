package farmerlab.crop;

import farmerlab.interfaces.Edible;

public class Tomato implements Edible {
    @Override
    public boolean getIfEdible() {
        return false;
    }

    @Override
    public void eat() {

    }
}
