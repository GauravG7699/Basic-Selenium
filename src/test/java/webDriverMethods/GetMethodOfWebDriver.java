package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodOfWebDriver {

	public static void main(String[] args) {
		// we use this method to launch the web application.
		//it accept string url
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		
		

	}

}
