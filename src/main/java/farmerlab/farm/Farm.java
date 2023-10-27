package farmerlab.farm;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    public Farm() {
        stables = new ArrayList<>();
        chickenCoops = new ArrayList<>();
        farmHouse = new FarmHouse();
    }
    public ArrayList<Stable> getStables() {
        return stables;
    }
    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }
    public void addStable(Stable stable) {
        stables.add(stable);
    }
    public void addChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
    }
    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", chickenCoops=" + chickenCoops +
                ", farmHouse=" + farmHouse +
                '}';
    }
}
