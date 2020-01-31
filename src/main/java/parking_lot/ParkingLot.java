package parking_lot;

import java.util.ArrayList;

public class ParkingLot {

	ArrayList<Car> mParkedCars;
	public ParkingLot(int numSlots) {
		mParkedCars = new ArrayList<Car>(numSlots+1);
		ReservedCar lReservedCar = new ReservedCar("reserved", "reserved");
		mParkedCars.add(lReservedCar);
	}
	
	public Ticket parkCar(Car aCar) {
		mParkedCars.add(aCar);
		int lSlotNumber = mParkedCars.indexOf(aCar);
		Ticket lTicket = new Ticket(aCar, lSlotNumber);
		return lTicket;
	}
	
	public int getCapacity() {
		int lResult = mParkedCars.size()-1;
		return lResult;
	}
	
}
