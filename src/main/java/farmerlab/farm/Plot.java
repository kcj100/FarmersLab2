package farmerlab.farm;

import farmerlab.animal.Chicken;
import farmerlab.animal.Horse;
import farmerlab.crop.Corn;
import farmerlab.crop.CornStalk;
import farmerlab.crop.TomatoPlant;
import farmerlab.person.Farmer;
import farmerlab.person.Pilot;
import farmerlab.vehicle.CropDuster;
import farmerlab.vehicle.Tractor;

public class Plot {
    public Plot(){

    }
    public Farm farm = new Farm();
    public Stable stable = new Stable();
    public Stable stable2 = new Stable();
    public Stable stable3 = new Stable();
    public ChickenCoop chickenCoop1 = new ChickenCoop();
    public ChickenCoop chickenCoop2 = new ChickenCoop();
    public ChickenCoop chickenCoop3 = new ChickenCoop();
    public FarmHouse farmHouse = new FarmHouse();
    public CropRow cropRow = new CropRow();
    public CropRow cropRow2 = new CropRow();
    public CropRow cropRow3 = new CropRow();
    public Field field = new Field();

    public Farmer farmer = new Farmer("Frolando", "Yehaw");
    public Pilot pilot = new Pilot("Frolanda", "Yehaw", 1);
    public CropDuster cropDuster = new CropDuster(1, "brrrr");
    public Tractor tractor = new Tractor(2, "Cañañan");
    public CornStalk cornStalk1 = new CornStalk();
    public CornStalk cornStalk2 = new CornStalk();
    public CornStalk cornStalk3 = new CornStalk();
    public CornStalk cornStalk4 = new CornStalk();
    public CornStalk cornStalk5 = new CornStalk();
    public TomatoPlant tomatoPlant1 = new TomatoPlant();
    public TomatoPlant tomatoPlant2 = new TomatoPlant();
    public TomatoPlant tomatoPlant3 = new TomatoPlant();
    public TomatoPlant tomatoPlant4 = new TomatoPlant();
    public TomatoPlant tomatoPlant5 = new TomatoPlant();

    public Chicken chicken1 = new Chicken("Cluck");
    public Chicken chicken2 = new Chicken("Feathers");
    public Chicken chicken3 = new Chicken("Nugget");
    public Chicken chicken4 = new Chicken("Peep");
    public Chicken chicken5 = new Chicken("Drumstick");
    public Chicken chicken6 = new Chicken("Egbert");
    public Chicken chicken7 = new Chicken("Bawk-Bawk");
    public Chicken chicken8 = new Chicken("Sunny");
    public Chicken chicken9 = new Chicken("Rosie");
    public Chicken chicken10 = new Chicken("Cinnamon");
    public Chicken chicken11 = new Chicken("Penny");
    public Chicken chicken12 = new Chicken("Quincy");
    public Chicken chicken13 = new Chicken("Rocky");
    public Chicken chicken14 = new Chicken("Sunny");
    public Chicken chicken15 = new Chicken("Tilly");
    public Horse horse7 = new Horse("Luna");
    public Horse horse8 = new Horse("Max");
    public Horse horse9 = new Horse("Sapphire");
    public Horse horse10 = new Horse("Apollo");
    public Horse horse11 = new Horse("Duchess");
    public Horse horse12 = new Horse("Romeo");
    public Horse horse1 = new Horse("Shadow");
    public Horse horse2 = new Horse("Thunder");
    public Horse horse3 = new Horse("Spirit");
    public Horse horse4 = new Horse("Midnight");

}
