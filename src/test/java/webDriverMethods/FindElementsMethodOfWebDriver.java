package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodOfWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
		List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
	   for(WebElement we : bikes) {
		   String bikeOptions = we.getText();
		   System.out.println(bikeOptions);
		   Thread.sleep(2000);

	}

  }
}
