package farmerlab.crop;

public class TomatoPlant extends Crop{

    private boolean hasBeenHarvested = false;

    private  boolean hasBeenFertilized = false;

    Tomato tomato;

    public TomatoPlant() {
        this.hasBeenHarvested = hasBeenHarvested;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Tomato yield(){
        if(isHasBeenFertilized()){
           if(isHasBeenHarvested()){
               System.out.println("Tomato plant has been harvested");
           } else {
               System.out.println("Tomato plant has not been harvested");
           }
        }
        return null;
    }


}
