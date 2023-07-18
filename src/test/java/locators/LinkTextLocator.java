package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Open a popup window")).click(); //Complete text is mendatory while using the linkText method.
			Thread.sleep(2000);
            driver.quit();
	}

}
