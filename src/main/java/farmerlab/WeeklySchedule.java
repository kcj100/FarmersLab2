package farmerlab;
import farmerlab.farm.Farm;
import farmerlab.person.Farmer;
import farmerlab.person.Pilot;
import farmerlab.vehicle.CropDuster;
import farmerlab.vehicle.Tractor;

import java.util.Scanner;
public class WeeklySchedule {
    private Farm farm;
    private Farmer farmer;
    private Pilot pilot;
    private Tractor tractor1;
    private CropDuster cropDuster;

    public WeeklySchedule(Farm farm, Farmer farmer, Pilot pilot, Tractor tractor1, CropDuster cropDuster) {
        this.farm = farm;
        this.farmer = farmer;
        this.pilot = pilot;
        this.tractor1 = tractor1;
        this.cropDuster = cropDuster;
    }


    public void startWeek() {
        Scanner scanner  = new Scanner(System.in);
        int counter = 0;
        runCurrentDay(counter);
        while(true) {
            if (counter == 7) {
                counter = 0;
            }
            System.out.println("Input 1 to enter to next day");
            String input = scanner.nextLine();
            if(input.equals("1")) {
                runCurrentDay(counter);
            }
            counter++;
        }
    }

    private void runCurrentDay(int day) {
        switch (day) {
            case 0:
                sunday();
                break;
            case 1:
                monday();
                break;
            case 2:
                tuesday();
                break;
            case 3:
                wednesday();
                break;
            case 4:
                thursday();
                break;
            case 5:
                friday();
                break;
            case 6:
                saturday();
                break;
        }
    }
    private void sunday() {
        System.out.println("SUNDAY:\n");
    }
    private void monday() {
        System.out.println("MONDAY:\n");
    }
    private void tuesday() {
        System.out.println("TUESDAY:\n");
    }
    private void wednesday() {
        System.out.println("WEDNESDAY:\n");
    }
    private void thursday() {
        System.out.println("THURSDAY:\n");
    }
    private void friday() {
        System.out.println("FRIDAY:\n");
    }
    private void saturday() {
        System.out.println("SATURDAY:\n");
    }

    private void morningRoutine() {
        // check what Froilan and Froilanda do every morning in the README.md.

    }
}
