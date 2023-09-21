package Automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParamerterSuite {
  @Test
  @Parameters({"parameter1","parameter2"})
  public void parameter(int a,int b) {
	  System.out.println(a);
	  System.out.println(b);

  }
}
