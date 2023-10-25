package farmerlab.vehicle;

public abstract class Aircraft extends Vehicle  {


    public Aircraft( int id, String sound) {
        super( id, sound);
    }

    public abstract void fly();
}
