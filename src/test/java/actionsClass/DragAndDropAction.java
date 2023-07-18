package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2: maximize the window
		driver.manage().window().maximize();
		
		//step 3: navigate to amazon.in
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		//drag and drop operation
		WebElement capital = driver.findElement(By.xpath("//div[.='Rome'][2]"));
		WebElement country = driver.findElement(By.xpath("//div[.='Italy']"));
		
		WebElement oslo = driver.findElement(By.xpath("//div[.='Oslo'][2]"));
		WebElement norway = driver.findElement(By.xpath("//div[.='Norway']"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(capital, country).perform();
		act.dragAndDrop(oslo, norway).perform();
		Thread.sleep(1000);
		System.out.println("drag and drop successfully");
		

	}

}
