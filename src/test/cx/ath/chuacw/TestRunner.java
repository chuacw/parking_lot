package test.cx.ath.chuacw;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(
//    		  TestJunit.class 
    		  TestCommandLineParserHasCommandArgs.class,
    		  TestCommandLineParserNextCommandArgsEquals2.class,
    		  TestCommandLineParserNextCommandArgsArgument1.class,
    		  TestCommandLineParserNextCommandArgsArgument2.class
    		  
      );
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println("Result=="+result.wasSuccessful());
   }
   
} 

