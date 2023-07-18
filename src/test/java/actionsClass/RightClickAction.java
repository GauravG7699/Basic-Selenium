package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
				
		//step 2: maximize the window
	    driver.manage().window().maximize();
				
		//step 3: navigate to amazon.in
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		//context click =right click action operation
		WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement edit = driver.findElement(By.xpath("//span[.='Edit']"));
		
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Thread.sleep(1000);
		
		act.click(edit).perform();
		Thread.sleep(1000);
				
     
	}

}
