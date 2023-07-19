package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	  public void method3() {
		  Reporter.log("This is method5", true);
	  }
	  @Test
	  public void method4() {
		  Reporter.log("This is method6", true);
	  }
}
