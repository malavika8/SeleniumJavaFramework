package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class TestNGMultipleBrowsers {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is :" +browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/driver/firefox/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver",projectPath+"/driver/IE/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1() throws Exception{
		
	}

}

