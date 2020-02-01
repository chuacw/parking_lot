package parking_lot;

import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class TestApp_initScanner_Stream {

 protected App mApp;
 
    @Before
    public void setup(){
     mApp = new App();
     
     String input = "add 5";
     InputStream in = new ByteArrayInputStream(input.getBytes());
     System.setIn(in);
     mApp.initScanner(System.in);

    }
 
 @Test
 public void test() {
  String[] lActualCommandArg = mApp.nextCommandArgs();
  String[] lExpectedArg = {"add", "5"};
  assertArrayEquals("Should be 'add 5'", lExpectedArg, lActualCommandArg);
 }
 
}
