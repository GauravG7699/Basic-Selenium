package framesAndPopups;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUpCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Date d=new Date();
		String[] dArr = d.toString().split(" ");
		String currentDate=dArr[0]+" "+dArr[1]+" "+dArr[2]+" "+dArr[5];
		System.out.println(currentDate);
		Thread.sleep(1000);
		 
		
		//Step 1: to launch the browser
		WebDriver driver = new ChromeDriver();
		//step 2; to maximize the window
		driver.manage().window().maximize();
		//step 3: wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step 4: navigate to app
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();

		// driver.findElement(By.xpath("//a[@class='close']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();

		// Navigate to From and To Elements
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));

		src.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();

		Thread.sleep(2000);

		dst.sendKeys("Del");
		
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();

		Thread.sleep(2000);

		// navigate to departure
		//driver.findElement(By.xpath("//label[@for='departure']")).click();

		// navigate to desired date in calender
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='"+currentDate+"']")).click();		

	}

}
