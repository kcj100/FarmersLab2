package farmerlab.crop;

import farmerlab.farm.CropRow;
import farmerlab.interfaces.Botanist;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Produce;

public abstract class Crop implements Produce, Botanist {

    private boolean hasBeenHarvested = false;

    private  boolean hasBeenFertilized = false;

     CropRow cropRow;

    public Crop(boolean hasBeenHavested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = hasBeenHavested;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public Edible yield() {

        return null;
    }

    public boolean isHasBeenHarvested() {

        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {

        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isHasBeenFertilized() {

        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {

        this.hasBeenFertilized = hasBeenFertilized;
    }
}
