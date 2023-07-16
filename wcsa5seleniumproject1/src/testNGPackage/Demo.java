package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 // System.out.println("This is demo testng class");
	 // Reporter.log("This is TestNG");
	  Reporter.log("This is demo  in TestNG class",true);
	  
  }
}
