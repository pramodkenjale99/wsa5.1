package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	 @Test
	  public void testMethod5() {
		  
		  long threadId5 = Thread.currentThread().getId();
		  Reporter.log("Thread Id of testMethod5 :"+threadId5, true);
	  }
	  
	  @Test
	  public void testMethod6()
	  {
		 long threadId6 = Thread.currentThread().getId();
		 Reporter.log("Thread Id of testMethod6 :"+threadId6, true);
		  
	  }
}
