package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
				
				//step 2: maximize the window
				driver.manage().window().maximize();
				
				//step 3: navigate to amazon.in
				driver.get("https://demoapp.skillrary.com/product.php?product=java ");
				Thread.sleep(2000);
				WebElement add = driver.findElement(By.id("add"));
				WebElement remove = driver.findElement(By.id("minus"));
						
			    // perform double click
				Actions act=new Actions(driver);
				
				act.doubleClick(add).perform();
				System.out.println("value added");
				
				Thread.sleep(2000);
				
				act.doubleClick(remove).perform();
				System.out.println("value remove");
				
				
				

	}

}
