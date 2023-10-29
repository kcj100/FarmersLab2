package farmerlab.farm;

import farmerlab.crop.Crop;

import java.util.ArrayList;

public class CropRow {


    private ArrayList<Crop> crops = new ArrayList<>();


    public void fertilizeAllCrops(){


            for(Crop i : crops){
                i.setHasBeenHarvested(false);
                i.setHasBeenFertilized(true);
            }
        System.out.println("All crops have been fertilized");
    }

    public void harvestAllCrops(){
        for (Crop crop : crops){
            crop.setHasBeenFertilized(true);
            crop.setHasBeenFertilized(false);
        }
        System.out.println("All crops have been harvested");

    }


    public void addCrop(Crop cropName){
        crops.add(cropName);
    }



    public ArrayList<Crop> getCropRow(){

        return crops;
    }


    public void setCropRow(ArrayList<Crop> cropRow) {

    }
}
