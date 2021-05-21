package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGDemo {
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		String projectPath = System.getProperty("user.dir");					
		System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
		System.out.println(projectPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("malavika");
		
		driver.close();
	}
	@Test
	public void test3() {
		System.out.println("I am inside test3");
	}
	

}
