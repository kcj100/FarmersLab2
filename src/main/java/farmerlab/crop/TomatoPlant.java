package farmerlab.crop;

public class TomatoPlant extends Crop{
    public TomatoPlant(boolean hasBeenHavested, boolean hasBeenFertilized) {
        super(hasBeenHavested, hasBeenFertilized);
    }

    @Override
    public Crop plant(Crop crop) {
        return crop;
    }


}
