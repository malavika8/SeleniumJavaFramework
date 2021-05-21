package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

import org.testng.annotations.AfterTest;
import org.apache.logging.log4j.Logger;
import demo.Log4j;

public class TestNG_demo {
	WebDriver driver = null;
	public static String browserName = null;
	private static Logger logger = LogManager.getLogger(Log4j.class);
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("fiefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/driver/firefox/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		logger.info("Browser Started");
	}
	@Test
	public void googleSearch(){
	driver.get("http://google.com");
	
	driver.findElement(By.name("q")).sendKeys("srvtnm");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void teardown(){
	driver.close();
	driver.quit();
	}
}
