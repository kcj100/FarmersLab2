package farmerlab.crop;


import farmerlab.interfaces.Edible;

public class CornStalk extends Crop{


    public CornStalk(boolean hasBeenHavested, boolean hasBeenFertilized) {
        super(hasBeenHavested, hasBeenFertilized);
    }

    public Edible yield() {
        return new Corn();
    }

public class CornStalk {


}
