package parking_lot;

import java.util.ArrayList;

public class ParkingLot {

	ArrayList<Car> mParkedCars;
	public ParkingLot(int numSlots) {
		mParkedCars = new ArrayList<Car>(numSlots+1);
	}
	
	public int parkCar(Car aCar) {
		mParkedCars.add(aCar);
		int result = mParkedCars.indexOf(aCar);
		return result;
	}
	
}
