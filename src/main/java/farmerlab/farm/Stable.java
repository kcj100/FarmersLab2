package farmerlab.farm;

import farmerlab.animal.Horse;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable(){
        horses = new ArrayList<>();
    }
    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public ArrayList<Horse> getHorses(){
        return horses;
    }
    public void addHorse(Horse horse){
        horses.add(horse);
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + horses +
                '}';
    }
}
