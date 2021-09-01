package parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingTest {

	@Test
	void checkParkinglotWithGivenNumSlots() {
		Controller sampleLot = new Controller(10);
		assertEquals(10,sampleLot.getTotalNumberOfSlots());
	}

}
