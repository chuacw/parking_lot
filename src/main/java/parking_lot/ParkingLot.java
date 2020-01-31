package parking_lot;

import java.util.ArrayList;

public class ParkingLot {

	public static final String cSlotFree = "Slot number %d is free";
	private ArrayList<Car> mParkedCars;
	private int mParkedCarsCapacity;
	
	/**
	 * @param aNumSlots
	 */
	public ParkingLot(int aNumSlots) {
		mParkedCarsCapacity = aNumSlots;
		mParkedCars = new ArrayList<Car>(mParkedCarsCapacity + 1);
		ReservedCar lReservedCar = new ReservedCar("reserved", "reserved");
		mParkedCars.add(lReservedCar);
	}
	
	/**
	 * @param aCar
	 * @return The ticket for a parked car.
	 */
	public Ticket parkCar(Car aCar) {
		mParkedCars.add(aCar);
		int lSlotNumber = mParkedCars.indexOf(aCar);
		Ticket lTicket = new Ticket(aCar, lSlotNumber);
		return lTicket;
	}
	
	/**
	 * @param aIndex
	 * @return A string indicating which slot is now free.
	 */
	public String removeCar(int aIndex) {
		mParkedCars.remove(aIndex);
		String lResult = String.format(cSlotFree, aIndex);
		return lResult;
	}
	
	/**
	 * @param aIndex
	 * @return The car parked at the aIndex location.
	 */
	public Car getCar(int aIndex) {
		Car lResult = mParkedCars.get(aIndex);
		return lResult;
	}
	
	/**
	 * @return The total slots for this parking lot
	 */
	public int getCapacity() {
		int lResult = mParkedCarsCapacity;
		return lResult;
	}
	
	/**
	 * @return The number of available slots, not including the reserved slot.
	 */
	public int getAvailable() {
		int lResult = mParkedCarsCapacity + 1 - mParkedCars.size();
		if (lResult < 0)
			lResult = 0;
		return lResult;
	}
	
	/**
	 * @return The number of used slots, not including the reserved slot.
	 */
	public int getUsed() {
		int lResult = mParkedCars.size() - 1;
		return lResult;
	}
	
}
