package test.cx.ath.chuacw;

import org.junit.Test;
import org.junit.Before;    

import cx.ath.chuacw.CommandLineParser;
import static org.junit.Assert.assertEquals;

public class TestCommandLineParserHasCommandArgs extends TestCommandLineParserBase1 {

    @Test
    public void test() {
    	assertEquals(commandlineParser.hasCommandArgs(), true);
    }
}
    