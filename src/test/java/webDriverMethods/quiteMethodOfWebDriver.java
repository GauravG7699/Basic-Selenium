package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quiteMethodOfWebDriver {

	public static void main(String[] args) {
		// to quite all browser including child browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		driver.quit();

	}

}
