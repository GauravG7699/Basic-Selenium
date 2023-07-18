package handlingAutosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCapturePhonesAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        // step 1: to launch browser
		   WebDriver driver = new ChromeDriver();
		
		//step 2: maximize the window
		  driver.manage().window().maximize();
		  
		 //step 3: navigate to Amazon.com
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(2000);
		  
		 //step 4: search for redmmi phone
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  
		  // step 5: capture all phones
		 List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	     for(WebElement element:list)
	     {
	    	 String value = element.getText();
	    	 System.out.println(value);
	     }
	     }

}
