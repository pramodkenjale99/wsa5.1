package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	  public void method3() {
		  Reporter.log("This is method3", true);
	  }
	  @Test
	  public void method4() {
		  int i =15;
		  int result = i/10;
		  Reporter.log("This is method4", true);
	  }
}
