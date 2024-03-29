package parking_lot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static String delimiter = " ";

	public String[] parseCommand(final String Line) {
		final String[] lResult = Line.split(delimiter);
		return lResult;
	}

	private Scanner mScanner;

	public void initScanner(final String input) {
		mScanner = new Scanner(input);
	}

	public void initScanner(final File aFile) {
		try {
			mScanner = new Scanner(aFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void initScanner(final InputStream input) {
		mScanner = new Scanner(input);
	}

	public boolean hasCommandArgs() {
		if (mScanner != null)
			return mScanner.hasNextLine();
		else
			return false;
	}

	public String[] nextCommandArgs() {
		String lLine;
		if (mScanner != null)
			lLine = mScanner.nextLine();
		else
			lLine = "";
		String[] lCmdArgs = lLine.split(delimiter);
		return lCmdArgs;
	}

	public static boolean mInteractive;

	public static void printPromptIfInteractive() {
		if (mInteractive) {
			System.out.print("$ ");
		}
	}

	public static void printNewLineIfInteractive() {
		if (mInteractive) {
			System.out.println("");
		}
	}

	public static void main(final String[] aArgs) {

		final App lCommandLineParser = new App();
		
		DispatchStrategy lDispatchStrategy = DispatchStrategy.getStrategy("fill_first");
		
		mInteractive = false; boolean lInitScanner = false;
		if (aArgs.length > 0) {
			final String lFileName = aArgs[0];
			File lFile = new File(lFileName);
			if (lFile.exists()) {
				lInitScanner = true;
				lCommandLineParser.initScanner(lFile);
			} else {
				String lFileDoesntExist = 
				  String.format("File: %s doesn't exist. "+
			        "Fallback to interactive mode.", lFileName);
				System.out.println(lFileDoesntExist);
			}
		}
		if ((!lInitScanner) || (aArgs.length == 0)) {
			lCommandLineParser.initScanner(System.in);
			mInteractive = true;
		}

//        System.out.println("Parking system ready...");

		CommandController lCommandController = new CommandController();

		printPromptIfInteractive();
		while (lCommandLineParser.hasCommandArgs()) {

			try {

				final String[] lCommandArgs = lCommandLineParser.nextCommandArgs();
				BaseCommand lCommand = lCommandController.findCommand(lCommandArgs[0]);
				if (lCommand != null) {
					int len = lCommand.getRequiredArgLen();
					ArrayList<String> lArgs = new ArrayList<String>();
					for (int i = 1; i <= len; i++) {
						lArgs.add(lCommandArgs[i]);
					}
					// String lRunResult1 = lCommand.run(lArgs);
					BaseStatus lRunStatus = lCommand.runStatus(lArgs);
					StatusOutputter lSO = new StatusOutputter(lRunStatus);
					String lRunResult2 = lSO.toString();
					if (lRunResult2 != null) {
						System.out.println(lRunResult2);
						// printNewLineIfInteractive();
					}
				} else {
					String lLine = String.format("Command not found: %s.", lCommandArgs[0]);
					System.out.println(lLine);
					// printNewLineIfInteractive();
				}

			} catch (Exception e) {
				System.out.println("You might not have run the commands in order.");
				System.out.println("HINT: If you're parking a car, you need to create a parking lot first.");
				System.out.println(
						"HINT: If you're trying to query parking lots for car info, you need to park a car first.");
				System.out.println("HINT: If you're trying to return a car, you need to have parked a car first.");
				System.out.println("");
				System.out.println("Stack trace follows:");
				e.printStackTrace();
				System.out.println("");
			}

			printPromptIfInteractive();

		}
	}

}
