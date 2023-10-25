package farmerlab.farm;

import java.util.ArrayList;

public class Field {
        private ArrayList<CropRow> cropRows;

        public Field(ArrayList<CropRow> cropRows) {
                this.cropRows = cropRows;
        }
        public Field(){
                cropRows = new ArrayList<>();

        }
        public ArrayList<CropRow> getCropRows(){
                return cropRows;
        }
        public void addCropRow(CropRow cropRow){
                cropRows.add(cropRow);
        }

        @Override
        public String toString() {
                return "Field{" +
                        "cropRows=" + cropRows +
                        '}';
        }
}
