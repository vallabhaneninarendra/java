package parking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParkingTest {
	Controller Controller;
    @BeforeEach
	public void setup() {
	Controller = new Controller();
	}
	@Test
	void checkParkinglotWithGivenNumSlots() {
		assertEquals(5,Controller.getTotalNumberOfSlots());
	}
	@Test
	public void CheckParkACar() {
		int slot1 = Controller.parkCar("Blue","AP36N0978");
	    assertEquals(1, slot1);
		int slot2 = Controller.parkCar("Red","AP39N0978");
	    assertEquals(2, slot2);
	    int slot3 = Controller.parkCar("White","AP39N0998");
	    assertEquals(3, slot3);
	    int slot4 = Controller.parkCar("pink","AP39N0998");
	    assertEquals(4, slot4);
	    int slot5 = Controller.parkCar("pink","AP39N0998");
	    assertEquals(5, slot5);
	     }
	
     @Test
     public void exitCarPark() {
    	 int slot1 = Controller.parkCar("Blue","AP36N0978");
 	     assertEquals(1, slot1);
    	 Map<Integer, Car> exit =  Controller.unParking(1);   	
    	 assertEquals(0,exit.size());
}
}