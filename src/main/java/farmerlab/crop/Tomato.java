package farmerlab.crop;

import farmerlab.interfaces.Edible;

public class Tomato implements Edible {

    private boolean isEdible;


    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    @Override
    public boolean getIfEdible() {
        return true;
    }
}
