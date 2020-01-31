package parking_lot;

public class CommandLeave extends BaseCommand {

	protected static String cLeave = "leave";

	public CommandLeave() {
		super(CommandLeave.cLeave, 1);
	}

}
