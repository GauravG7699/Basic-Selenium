package handlingAutosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCapLaptopsAbove4Rating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2: maximize the window
		driver.manage().window().maximize();
		
		//step 3: navigate to amazon.in
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//step 4: search for laptops and click
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		//step 5: search laptop whose rating 4 and above
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		System.out.println("**********List Of Laptops***********");
		for(WebElement element:list)
		{
			String laptop = element.getText();
			System.out.println(laptop);
		}

	}

}
