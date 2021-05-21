package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits(){
		String projectPath = System.getProperty("user.dir");					
		System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.id("input")).sendKeys("Automation ste by step");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
	}

}
