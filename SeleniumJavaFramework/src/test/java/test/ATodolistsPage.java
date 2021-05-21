package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ATodolistsPage {
	
	    private WebDriver driver;
	    public ATodolistsPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
	    	  this.driver = driver;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//driver = new ChromeDriver();
		}

	    public void enterTodoListName(final String listName) {
	        final WebElement inputField =
	                driver.findElement(
	                        By.cssSelector(".new-todo-list"));

	        inputField.sendKeys(listName + Keys.ENTER);
	    }

	    public String getDisplayedListText(final String listName) {
	        WebElement todoListEntry = driver.findElement(
	                By.cssSelector(
	                        "li[data-id='" + listName + "']"));

	        return todoListEntry.findElement(
	                By.tagName("label")).getText();
	    }

	    public void clickOnList(final String listName) {
	        WebElement todoListEntry = driver.findElement(
	                By.cssSelector(
	                        "li[data-id='" + listName + "']"));

	        todoListEntry.findElement(By.tagName("a")).click();
	    }
	

}
