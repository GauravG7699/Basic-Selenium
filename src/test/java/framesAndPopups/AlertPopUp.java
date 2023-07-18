package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// steep 1: launch the browser
		WebDriver driver = new ChromeDriver();
		
		//step 2: maximize the window
		driver.manage().window().maximize();
		
		//step 3; wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 4: load the url-demoqa APP
		driver.get("https://demoqa.com/alerts");
		
		//handle alert pop up -ok button -click ok
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("click ok on alert pop up");
		Thread.sleep(1000);
		
		//get Text from alert popup
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		//dismiss the confirmation popup
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
	    String successMsg = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
		System.out.println(successMsg);
		
		//enter data into prompt popup
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("Gaurav G");
		al.accept();
		
		String msg = driver.findElement(By.xpath("(//span[@class='text-success'])[2]")).getText();
		System.out.println(msg);
		
	}

}
