/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package parking_lot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static String delimiter = " ";
	
	public String[] parseCommand(final String Line) {
        final String[] result = Line.split(delimiter);
        return result;
    }

    private Scanner mScanner;

    public void initScanner(String input) {
        mScanner = new Scanner(input);        
    }

    public void initScannerFileName(String aFileName) {
        try {
			mScanner = new Scanner(new File(aFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
    }

    public void initScanner(InputStream input) {
    	mScanner = new Scanner(input);
    }
    
    public boolean hasCommandArgs() {
        if (mScanner != null)
            return mScanner.hasNextLine();
        else
            return false;
    }

    public String[] nextCommandArgs() {
        String line;
        if (mScanner != null)
            line = mScanner.nextLine();
        else
            line = "";
        String[] cmdArgs = line.split(" ");
        return cmdArgs;
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

    public static void main(final String[] args) {

        final App commandlineParser = new App();

        mInteractive = false;
        if (args.length == 0) {
        	commandlineParser.initScanner(System.in);
        	mInteractive = true;
        } else {
            final String lFileName = args[0];
            commandlineParser.initScannerFileName(lFileName);
        }
        
        System.out.println("Parking system ready...");

        CommandController lCommandController = new CommandController();
        
        printPromptIfInteractive();
        while (commandlineParser.hasCommandArgs()) {
        	final String[] lCommandArgs = commandlineParser.nextCommandArgs();
            BaseCommand lCommand = lCommandController.findCommand(lCommandArgs[0]);
            if (lCommand != null) {
            	int len = lCommand.getRequiredArgLen();
            	ArrayList<String> lArgs = new ArrayList<String>();
            	for (int i = 1; i <= len; i++) {
            	  lArgs.add(lCommandArgs[i]);	
            	}
            	String runResult = lCommand.run(lArgs);
            	if (runResult != null) {
            		System.out.println(runResult);
            		printNewLineIfInteractive();
            	}
            } else {
            	String lLine = String.format("Command not found: %s.", lCommandArgs[0]);
            	System.out.println(lLine);
            	printNewLineIfInteractive();
            }
            printPromptIfInteractive();
        }
    }

}
