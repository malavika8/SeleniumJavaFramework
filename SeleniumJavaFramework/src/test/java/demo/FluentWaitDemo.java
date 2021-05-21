package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;

public class FluentWaitDemo {
	public static void main(String[] args) {
		fluentWaits();
	}
	
	public static void fluentWaits(){
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://google.com");
	driver.findElement(By.id("input")).sendKeys("Automation step by step");
	driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	
	// Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(30, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);

	   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		   public WebElement apply(WebDriver driver) {
			   WebElement linkElement = driver.findElement(By.linkText("abcd")); 
			   if (linkElement.isEnabled()) {
				   System.out.println("Element Found");
			   }
			   return linkElement;
			   //return driver.findElement(By.id("foo"));
		   }
	   });
	   element.click();
	}
}