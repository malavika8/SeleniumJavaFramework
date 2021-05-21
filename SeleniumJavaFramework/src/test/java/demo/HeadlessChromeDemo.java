package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");		
		options.addArguments("window-size=1280,800");	
		WebDriver driver = new ChromeDriver(options);

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
		driver.get("http://google.com");
		driver.findElement(By.id("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
	}
}
