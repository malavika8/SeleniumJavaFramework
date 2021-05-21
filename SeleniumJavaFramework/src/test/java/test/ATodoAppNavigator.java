package test;

import org.openqa.selenium.WebDriver;

public class ATodoAppNavigator {
	private WebDriver driver;
	
	public main(String[] args) {
		// TODO Auto-generated method stub
		 public ATodoAppNavigator(final WebDriver driver) {
		        this.driver = driver;
		    }

		//driver = new ChromeDriver();
		 public ATodolistsPage todoListsPage() {
		        driver.get("https://eviltester.github.io/simpletodolist/todolists.html");
		        return new ATodolistsPage(driver);
		    }

		 //public ATodoAppNavigator to(){
		  //      return this;
		  //  }
	}

   
    
}
