package cx.ath.chuacw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommandLineParser {

    public String[] parseCommand(final String Line) {
        final String[] result = Line.split(" ");
        return result;
    }

    private Scanner scanner;

    public void initScanner(final String filename) {
        try {
            scanner = new Scanner(new File(filename));
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean hasCommand() {
        if (scanner != null)
            return scanner.hasNextLine();
        else
            return false;
    }

    public String[] nextCommandArgs() {
        String line;
        if (scanner != null)
            line = scanner.nextLine();
        else
            line = "";
        String[] cmdArgs = line.split(" ");
        return cmdArgs;
    }

    public static void main(final String[] args) {

        if (args.length == 0) {
            System.out.println("Input filename required.");
            return;
        }

        final CommandLineParser commandlineParser = new CommandLineParser();

        final String filename = args[0];
        commandlineParser.initScanner(filename);

        while (commandlineParser.hasCommand()) {
            final String[] commandArgs = commandlineParser.nextCommandArgs();
            
            System.out.println("Command: " + commandArgs[0]);
        }
    }
}