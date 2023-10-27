package farmerlab.crop;

public class TomatoPlant extends Crop{



    public TomatoPlant() {
        super(false, false);

    }

    public Tomato yield(){
        if(isHasBeenFertilized()){
           if(!isHasBeenHarvested()){
               System.out.println("Tomato plant has been harvested");
               setHasBeenFertilized(false);
               return new Tomato();
           } else {
               System.out.println("Tomato plant has not been harvested");
           }
        }
        return null;
    }


}
