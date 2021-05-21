package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnMethods= {"test2"},priority = 1)
	public void test1()
	{
		System.out.println("I am inside test1");
	}
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("I am inside test1");
	}
	
	@Test(dependsOnMethods= {"test4","test5"})
	public void test3()
	{
		System.out.println("I am inside test1");
	}
	@Test(dependsOnGroups = {"sanity.*"})
	public void test4()
	{
		System.out.println("I am inside test1");
	}
	@Test(groups = {"sanity1"})
	public void test5()
	{
		System.out.println("I am inside test1");
	}
	
	@Test(groups = {"sanity2"})
	public void test6()
	{
		System.out.println("I am inside test1");
	}
}
