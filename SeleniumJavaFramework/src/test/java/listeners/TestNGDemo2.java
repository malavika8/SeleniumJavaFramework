package listeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGDemo2 {
	@Test
	public void test4() {
		System.out.println("I am inside test4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside test5");
		Assert.assertTrue(false);
	}
	
	public void test6() {
		System.out.println("I am inside test6");
	}
	

}
