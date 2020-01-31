package parking_lot;

public class BaseCommandQuery extends BaseCommand {
	
	protected static String cNotFound = "Not found";

	public BaseCommandQuery(String aCommand, int aArgLen) {
		super(aCommand, aArgLen);
	}

}
