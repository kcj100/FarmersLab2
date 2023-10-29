package farmerlab.crop;

import farmerlab.interfaces.Edible;

public class Corn extends Crop implements Edible {
    @Override
    public boolean getIfEdible() {
        return true;
    }


}
