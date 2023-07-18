package handlingAutosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCaptureProducts50 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //step 1: to launch browser
		WebDriver driver=new ChromeDriver();
		
		//step 2: to maximize the window
		driver.manage().window().maximize();
		
		// step 3; navigate to amazon.in
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		// step 4: click on today's deals
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(2000);
		
		//step 5: click on electronics
		driver.findElement(By.xpath("//li[@aria-posinset='5']")).click();
		
		
		Thread.sleep(2000);
		
		//step 6: click and capture all the product which having 50% discount
		 driver.findElement(By.xpath("//a[@data-csa-c-element-id='filter-discount-50-']")).click();
		 Thread.sleep(2000);
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']"));
		 System.out.println("**************list of all product************");
		 
		 for(WebElement element:list)
		 {
		
			String allproduct = element.getText();
			System.out.println(allproduct);
		 }
		 
		
	}

}
