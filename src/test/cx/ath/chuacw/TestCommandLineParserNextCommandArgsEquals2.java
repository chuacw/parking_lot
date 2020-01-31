package test.cx.ath.chuacw;

import org.junit.Test;
import org.junit.Before;    

import cx.ath.chuacw.CommandLineParser;
import static org.junit.Assert.assertEquals;

public class TestCommandLineParserNextCommandArgsEquals2 extends TestCommandLineParserHasCommandArgs {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals(commandArgs.length, 2);
    }
}
    