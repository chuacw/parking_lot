package parking_lot;

public class CommandQuerySlotForCarColour extends BaseCommand {

	protected static String cQuerySlotForCarColour = "slot_numbers_for_cars_with_colour";

	public CommandQuerySlotForCarColour(String aCommand, int aArgLen) {
		super(CommandQuerySlotForCarColour.cQuerySlotForCarColour, 1);
		// TODO Auto-generated constructor stub
	}

}
