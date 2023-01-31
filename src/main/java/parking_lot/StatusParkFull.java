package parking_lot;

public class StatusParkFull extends StatusSlot {

	public static String cParkFull = "Sorry, parking lot is full";
	
	public StatusParkFull() {
	}

	@Override
	public String toString() {
		return cParkFull;
	}
}
