package farmerlab.farm;

//import farmerlab.crop.Crop;

import farmerlab.crop.Crop;
import farmerlab.crop.Tomato;
import farmerlab.crop.TomatoPlant;

import java.util.ArrayList;

public class CropRow {


    private ArrayList<Crop> cropRows;

    public void addCrop(Crop cropName){
        System.out.println(cropName);
    }



    public ArrayList<Crop> getCropRow(){

        return new ArrayList<>();
    }


    public void setCropRow(ArrayList<Crop> row){

    }

    public int getRowNumber(){

        return 0;
    }
}
