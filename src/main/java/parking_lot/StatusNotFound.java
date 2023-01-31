package parking_lot;

public class StatusNotFound extends BaseStatus {
	
	protected static String cNotFound = "Not found";

	public StatusNotFound() {
	}
	
	@Override
	public String toString() {
		return cNotFound;
	}
	
}
