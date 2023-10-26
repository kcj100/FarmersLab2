package farmerlab.crop;

import farmerlab.farm.CropRow;
import farmerlab.interfaces.Botanist;
import farmerlab.interfaces.Edible;
import farmerlab.interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenHarvested = false;

    private  boolean hasBeenFertilized = false;



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
