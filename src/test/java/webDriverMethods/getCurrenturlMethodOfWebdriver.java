package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrenturlMethodOfWebdriver {
	public static void main(String[] args) {
		//to get current webpage url ......return type is string
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

}
