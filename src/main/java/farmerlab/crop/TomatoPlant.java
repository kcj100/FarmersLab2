package farmerlab.crop;

public class TomatoPlant extends Crop{
    public TomatoPlant(boolean hasBeenHavested, boolean hasBeenFertilized) {
        super(hasBeenHavested, hasBeenFertilized);
    }

    public Tomato yield(){
        Crop tomato = Tomato;
        return tomato;
    }
}
