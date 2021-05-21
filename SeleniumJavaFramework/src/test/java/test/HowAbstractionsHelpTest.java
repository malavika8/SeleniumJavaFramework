package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowAbstractionsHelpTest {
	
	 private WebDriver driver;

	    @BeforeEach
	    public void setupData(){
	        driver = new ChromeDriver();
	        driver.get("https://eviltester.github.io/simpletodolist");
	    }

	    @Test
	    public void canCreateATodoList(){

	        ATodoAppNavigator navigate = new ATodoAppNavigator(driver);
	        ATodolistsPage todoLists = navigate.to().todoListsPage();
	        todoLists.enterTodoListName("my todo list");
	        Assertions.assertEquals("my-todo-list" ,
	                todoLists.getDisplayedListText("my-todo-list"));

	    }

	    @Test
	    public void canCreateAnotherTodoList() {

	        String listName = new ATodoAppUser(driver).createsATodoList();
	        Assertions.assertEquals(listName ,
	                new ATodolistsPage(driver).getDisplayedListText(listName));
	    }

	    @AfterEach
	    public void closeBrowser(){
	        driver.close();
	    }
}
