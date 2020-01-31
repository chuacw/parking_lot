package test.cx.ath.chuacw;

import org.junit.Before;    

import cx.ath.chuacw.CommandLineParser;

public class TestCommandLineParserBase1 {

	protected CommandLineParser commandlineParser;
	
    @Before
    public void setup(){
    	commandlineParser = new CommandLineParser();
    	commandlineParser.initScanner("park test");
    }
        
}
    