package farmerlab.animal;

import farmerlab.interfaces.Edible;

public class Egg implements Edible {
    private final boolean isEdible = true;

    public boolean getIfEdible() {
        return isEdible;
    }

}
