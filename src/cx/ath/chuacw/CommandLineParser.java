package cx.ath.chuacw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommandLineParser {

    public static void main(final String[] args) {

        if (args.length == 0) {
            System.out.println("Input filename required.");
            return;
        }
        final String filename = args[0];
        Scanner scanner;
        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                final String commandline = scanner.nextLine();
                final String[] commandArgs = commandline.split(" ");
            }
        } catch (final FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}