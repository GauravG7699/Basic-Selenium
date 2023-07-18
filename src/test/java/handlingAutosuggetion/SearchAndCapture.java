package handlingAutosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCapture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1: launch the browser
		WebDriver driver = new ChromeDriver();
				
		//step 2: maximize the window
		driver.manage().window().maximize();
				
		//step 3: load the url-demo actitime app
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    
	    //step 4: search for redmi phone
	    driver.findElement(By.name("q")).sendKeys("redmi phones");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        //step 5; capture all phones
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        for(WebElement element:list)
        {
        	System.out.println("element is printed");
        	String phones = element.getText();
        	System.out.println(phones);
        }
	}

}
