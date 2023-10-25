package farmerlab.crop;


import farmerlab.interfaces.Edible;

public class CornStalk extends Crop{


    public CornStalk(boolean hasBeenHavested, boolean hasBeenFertilized) {
        super(hasBeenHavested, hasBeenFertilized);
    }

    public Edible yield() {
        return new Corn();
    }

    @Override
    public Crop plant(Crop crop) {
        return null;
    }

//public class CornStalk {
//
//}


}
