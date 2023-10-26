package farmerlab.farm;

import farmerlab.crop.Crop;

import java.util.ArrayList;

public class CropRow {


    private ArrayList<Crop> cropRows;


    public CropRow() {
        ArrayList<Crop> cropRows = new ArrayList<>();
    }

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
        cropRows.add(cropName);
    }



//    public ArrayList<Crop> getCropRow(){
//
//        return ArrayList<Field> cropRows;
//    }


    public void setCropRow(ArrayList<Crop> row){

    }



}
