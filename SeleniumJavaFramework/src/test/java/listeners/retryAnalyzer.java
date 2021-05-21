package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
	 
public class retryAnalyzer implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	 

	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}

	//import org.testng.Assert;
	//import org.testng.annotations.Test;
	 
	//public class TestclassSample {
	 
	 // @Test(retryAnalyzer = MyRetry.class)
	 // public void test2() {
	 //   Assert.fail();
	 // }
	//}


