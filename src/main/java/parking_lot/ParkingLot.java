package parking_lot;

import java.util.ArrayList;

public class ParkingLot {

	public static final String cSlotFree = "Slot number %d is free";
	private ArrayList<Car> mParkedCars;
	private int mParkedCarsCapacity;
	private int mRealCapacity;
	
	/**
	 * @param aNumSlots
	 */
	public ParkingLot(int aNumSlots) {
		mParkedCarsCapacity = aNumSlots;
		mRealCapacity = mParkedCarsCapacity + 1;
		mParkedCars = new ArrayList<Car>(mRealCapacity);
		ReservedCar lReservedCar = new ReservedCar("reserved", "reserved");
		mParkedCars.add(lReservedCar);
	}
	
	/**
	 * @param aCar
	 * @return The ticket for a parked car.
	 */
	public Ticket parkCar(Car aCar) {
		int lIndex = -1;
		int lLen = mParkedCars.size();
		for (int i = 0; i < lLen; i++) {
			Car lCar = mParkedCars.get(i);
			if (lCar == null) {
				lIndex = i;
				break;
			}
		}
		if (lIndex != -1) {
    		mParkedCars.set(lIndex, aCar);
		} else {
			mParkedCars.add(aCar);
		}
		int lSlotNumber = mParkedCars.indexOf(aCar);
		Ticket lTicket = new Ticket(aCar, lSlotNumber);
		return lTicket;
	}
	
	/**
	 * @param aIndex
	 * @return A string indicating which slot is now free.
	 */
	public String removeCar(int aIndex) {
		mParkedCars.set(aIndex, null);
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
		int lAvailable = 0;
		int lLen = mParkedCars.size();
		for (int i = 1; i < lLen; i++) {
			Car lCar = mParkedCars.get(i);
			if (lCar == null) {
				lAvailable++;
			}
		}
		if (lLen < mRealCapacity)
			lAvailable += (mRealCapacity - lLen);
		return lAvailable;
	}
	
	/**
	 * @return The number of used slots, not including the reserved slot.
	 */
	public int getUsed() {
		int lResult = mParkedCars.size() - 1;
		return lResult;
	}
	
}
