package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
				
		//step 2;- maximise the browser
		 driver.manage().window().maximize();
		 
		 //step 3: wait for 10 sec
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 
		//navigate to Vtiger 
		 driver.get("https://jqueryui.com/droppable//");
		 
		 //handle thge frame
		 driver.switchTo().frame(0);
		 System.out.println("switch the control to the frame");
		 
		 //drag and drop
		 WebElement drag = driver.findElement(By.id("draggable"));
		 WebElement drop = driver.findElement(By.id("droppable"));
		 
		 Actions act=new Actions(driver);
		 act.dragAndDrop(drag, drop).perform();
		 System.out.println("drag and drop successful");
		 
		 //switch the control back to the main page
		 driver.switchTo().defaultContent();
		 System.out.println("swich the control back to the main page");
		 
		 //click on accept link
		 driver.findElement(By.linkText("Accept")).click();
		 System.out.println("click on accept link");

	}

}
