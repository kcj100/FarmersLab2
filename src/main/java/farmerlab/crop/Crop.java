package farmerlab.crop;

import farmerlab.farm.CropRow;
import farmerlab.interfaces.Botanist;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Produce;

public abstract class Crop implements Produce, Botanist {

    private boolean hasBeenHavested = false;

    private  boolean hasBeenFertilized = false;

     CropRow cropRow;

    public Crop(boolean hasBeenHavested, boolean hasBeenFertilized) {
        this.hasBeenHavested = hasBeenHavested;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public Edible yield() {
        return null;
    }

    public boolean isHasBeenHavested() {
        return hasBeenHavested;
    }

    public void setHasBeenHavested(boolean hasBeenHavested) {
        this.hasBeenHavested = hasBeenHavested;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
