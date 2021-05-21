package demo;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
	@Test(groups = {"sanity","smoke"})
	public void test1() {
		System.out.println("I am inside Test1");
	}
	
	@Test(groups = {"windows.regression"})
	public void test2() {
		System.out.println("I am inside Test2");
	}
	
	@Test(groups = {"linux.regression"})
	public void test3() {
	System.out.println("I am inside Test3");
	}
	@Test(groups = {"regression"})
	public void test4() {
	System.out.println("I am inside Test4");
	}
}

