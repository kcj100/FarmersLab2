package farmerlab.crop;


import farmerlab.interfaces.Edible;

public class CornStalk extends Crop{

    public CornStalk() {
        super(false, false);

    }




    public Corn yield(){
        if(isHasBeenFertilized()){
            if(!isHasBeenHarvested()){
                System.out.println("CornStalk plant has been harvested");
                setHasBeenFertilized(false);
                return new Corn();
            } else {
                System.out.println("CornStalk plant has not been harvested");
            }
        }
        return null;

    }








}
