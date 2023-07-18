package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndReleaseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
						
		//step 2: maximize the window
	    driver.manage().window().maximize();
						
	    //step 3: navigate to amazon.in
		driver.get("https://demoqa.com/buttons");
	    Thread.sleep(2000);
	    
	   WebElement clickele = driver.findElement(By.xpath("//button[.='Click Me']"));
	   
	   //click and hold operation
	   Actions act=new Actions(driver);
	   
	   act.clickAndHold(clickele).perform();
	   System.out.println("element click and hold");
	   Thread.sleep(1000);
	   
	   act.release(clickele).perform();
	   System.out.println("element release");
	   

	}

}
