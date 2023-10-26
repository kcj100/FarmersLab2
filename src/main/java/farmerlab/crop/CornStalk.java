package farmerlab.crop;


import farmerlab.interfaces.Edible;

public class CornStalk extends Crop{

    private boolean hasBeenHarvested = false;

    private  boolean hasBeenFertilized = false;

    public CornStalk() {
        this.hasBeenHarvested = hasBeenHarvested;
        this.hasBeenFertilized = hasBeenFertilized;
    }




    public Corn yield(){
        if(isHasBeenFertilized()){
            if(isHasBeenHarvested()){
                System.out.println("CornStalk plant has been harvested");
            } else {
                System.out.println("CornStalk plant has not been harvested");
            }
        }
        return null;

    }

//    public Edible yield() {
//        return new Corn();
//    }





}
