package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethodOfWebDriver {

	public static void main(String[] args) {
		// this method is used to get title of current webpage
		//return type is string
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		String gettitleofloginpage = driver.getTitle();
		System.out.println(gettitleofloginpage);
		

	}

}
