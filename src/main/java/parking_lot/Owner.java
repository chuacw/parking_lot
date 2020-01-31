package parking_lot;

public class Owner {
	
	static ParkingLot mParkingLot;
	
	public static ParkingLot getParkingLot() {
		return mParkingLot;
	}
	
	public static void createParkingLot(int aNumSlots) {
		mParkingLot = new ParkingLot(aNumSlots);
	}
	
}
