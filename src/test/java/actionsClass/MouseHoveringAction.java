package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2;- maximise the browser
		 driver.manage().window().maximize();
		 
		 //navigate to flipkart
		 driver.get("https://www.flipkart.com");
		 Thread.sleep(2000);
		 
		 //click on cancel popup
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(2000);
		 
		 //mouse hovering actions 
		 
		 WebElement element = driver.findElement(By.xpath("//div[.='Electronics']"));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(element).perform();
		System.out.println("mouse hovering done");
		
		
        WebElement game = driver.findElement(By.xpath("//a[.='Gaming']"));
        ac.moveToElement(game).perform();
        System.out.println("move to gaming option");
        
        WebElement gamepad = driver.findElement(By.xpath("//a[.='Gamepads']"));
        ac.moveToElement(gamepad).perform();
        gamepad.click();
		

	}

}
