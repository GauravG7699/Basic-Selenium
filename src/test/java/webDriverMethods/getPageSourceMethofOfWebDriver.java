package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceMethofOfWebDriver {

	public static void main(String[] args) {
		// To get
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

	}

}
