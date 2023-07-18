package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignActionClassMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2;- maximise the browser
		 driver.manage().window().maximize();
		 
		 //navigate to flipkart
		 driver.get("https://www.flipkart.com");
		 Thread.sleep(2000);
		 
		 //moved by  offset value
		 Actions ac = new Actions(driver);
		 ac.moveByOffset(20,20).click().perform();
		 System.out.println("move by Offset");
		 
		 //click on appliances
		 driver.findElement(By.xpath("//div[.='Appliances']")).click();
		 Thread.sleep(2000);
		 
		 //navigate to home & furniture
		 WebElement homeandapp = driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		 ac.moveToElement(homeandapp).perform();
		 Thread.sleep(2000);
		 
		 WebElement paintings = driver.findElement(By.xpath("//a[.='Paintings']"));
		 ac.moveToElement(paintings).click().perform();
		 Thread.sleep(2000);
		 
		 WebElement price = driver.findElement(By.xpath("//div[.='Price -- Low to High']"));
		 ac.click(price).perform();
		 Thread.sleep(2000);
		 
		 WebElement indianar = driver.findElement(By.partialLinkText("Indianara"));
		 ac.click().perform();

	}

}
