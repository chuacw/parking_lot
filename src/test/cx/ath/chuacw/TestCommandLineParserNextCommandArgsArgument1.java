package test.cx.ath.chuacw;

import org.junit.Test;
import org.junit.Before;    

import cx.ath.chuacw.CommandLineParser;
import static org.junit.Assert.assertEquals;

public class TestCommandLineParserNextCommandArgsArgument1 extends TestCommandLineParserBase1 {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals(commandArgs[0], "park");
    }
        
}
    