package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch(){
		String projectPath = System.getProperty("user.dir");									
		System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("srvtnm");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
		driver.close();
	}
}
