package farmerlab.vehicle;

public class CropDuster extends Aircraft {
    public CropDuster(String name) {
        super(name);
    }

    public void fertilize(){

    }

    @Override
    public boolean isInUse() {
        return false;
    }

    @Override
    public void setInUse(boolean available) {

    }
}
