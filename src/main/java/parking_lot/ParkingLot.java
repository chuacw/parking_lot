package parking_lot;

import java.util.ArrayList;

public class ParkingLot {

	private ArrayList<Car> mParkedCars;
	private int mParkedCarsCapacity;
	
	public ParkingLot(int aNumSlots) {
		mParkedCarsCapacity = aNumSlots;
		mParkedCars = new ArrayList<Car>(mParkedCarsCapacity+1);
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
		int lResult = mParkedCarsCapacity;
		return lResult;
	}
	
	public int getAvailable() {
		int lResult = mParkedCarsCapacity - mParkedCars.size();
		return lResult;
	}
	
}
