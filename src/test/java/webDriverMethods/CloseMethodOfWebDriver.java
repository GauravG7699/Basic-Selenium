package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethodOfWebDriver {

	public static void main(String[] args) {
		// it is used the close the parent browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		driver.close();
		
		

	}

}
