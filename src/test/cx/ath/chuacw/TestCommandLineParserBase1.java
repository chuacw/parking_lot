package test.cx.ath.chuacw;

import org.junit.Test;
import org.junit.Before;    

import cx.ath.chuacw.CommandLineParser;
import static org.junit.Assert.assertEquals;

public class TestCommandLineParserBase1 {

	protected CommandLineParser commandlineParser;
	
    @Before
    public void setup(){
    	commandlineParser = new CommandLineParser();
    	commandlineParser.initScanner("park test");
    }
        
}
    