package handlingAutosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForHpLaptop {

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
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
				//we can also use (keys.enter) for click action .
				//driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				
				List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
				
				System.out.println("**********List Of Laptops***********");
				for(WebElement element:list)
				{
					String laptop = element.getText();
					if(laptop.contains("HP"))
					{
						System.out.println(element.getText());
						element.click();
						break;
						
					}
					
				}
				
				

	}

}
