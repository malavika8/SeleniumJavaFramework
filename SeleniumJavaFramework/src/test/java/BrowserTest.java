import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main(String[] args) {
		//public class Test1_GoogleSearch {
			  // public static void main(String[] args) {

				//}
				
			   //public void googleSearch(){

				String projectPath = System.getProperty("user.dir");					
				System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chrome/chromedriver.exe");
				System.out.println(projectPath);
				WebDriver driver = new ChromeDriver();
				driver.get("http://google.com");
				driver.findElement(By.name("q")).sendKeys("malavika");
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				
				//driver.findElement(By.name("btnK")).click();
				driver.close();
				}			
			}
