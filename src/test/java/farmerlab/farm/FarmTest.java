package farmerlab.farm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {

    @Test
    void getStables() {
        Farm farm = new Farm();
        assertNotNull(farm.getStables());
        assertTrue(farm.getStables().isEmpty());
    }
    @Test
    void getChickenCoops() {
        Farm farm = new Farm();
        assertNotNull(farm.getChickenCoops());
        assertTrue(farm.getChickenCoops().isEmpty());
    }
    @Test
    void addStable() {
        Farm farm = new Farm();
        Stable stable = new Stable();
        farm.addStable(stable);
        assertTrue(farm.getStables().contains(stable));
    }
    @Test
    void addChickenCoop() {
        Farm farm = new Farm();
        ChickenCoop chickenCoop = new ChickenCoop();
        farm.addChickenCoop(chickenCoop);
        assertTrue(farm.getChickenCoops().contains(chickenCoop));
    }
    @Test
    void getFarmHouse() {
        Farm farm = new Farm();
        assertNotNull(farm.getFarmHouse());
    }
    @Test
    void setFarmHouse() {
        Farm farm = new Farm();
        FarmHouse newFarmHouse = new FarmHouse();
        farm.setFarmHouse(newFarmHouse);
        assertEquals(newFarmHouse.getFarmHands(), farm.getFarmHouse().getFarmHands());
    }
}