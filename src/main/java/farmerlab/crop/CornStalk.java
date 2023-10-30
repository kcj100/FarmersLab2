package farmerlab.crop;


import farmerlab.interfaces.Edible;

public class CornStalk extends Crop{

    public CornStalk() {
        super(false, false);

    }




    public Corn yield(){
        //here you have a nested if condtion
        // you can simply use && operator to combine
        // if(isHasBeenFertilized && !isHasBeenFertilized)

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
