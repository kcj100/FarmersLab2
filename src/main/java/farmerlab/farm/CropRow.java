package farmerlab.farm;

import farmerlab.crop.Crop;

import java.util.ArrayList;

public class CropRow {


    private ArrayList<Crop> cropRows;

    Field field;


    public void fertilizeAllCrops(){
            for(Crop i : cropRows){
                i.setHasBeenHarvested(true);

            }
        System.out.println("All crops have been fertilized");
    }

    public void harvestAllCrops(){
        for (Crop crop : cropRows){
            crop.setHasBeenFertilized(true);
        }
        System.out.println("All crops have been harvested");

    }


    public void addCrop(Crop cropName){
        System.out.println(cropName);
    }



    public ArrayList<Crop> getCropRow(){

        return new ArrayList<>();
    }


    public void setCropRow(ArrayList<Crop> row){

    }



}
