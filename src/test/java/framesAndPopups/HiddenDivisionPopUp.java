package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Step 1: to launch the browser
		WebDriver driver = new ChromeDriver();
		//step 2; to maximize the window
		driver.manage().window().maximize();
		//step 3: wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step 4: navigate to actitime
		driver.get("https://demo.actitime.com/login.do");
		//step 5:find webelement and login to actitime
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login '] ")).click();
		
		Thread.sleep(2000);
		
		//step 6:navigate to task
		driver.findElement(By.id("container_tasks")).click();
		//step 7: navigate to spaceship testing
		driver.findElement(By.xpath("(//div[.='Spaceship testing'])[1]")).click();
		Thread.sleep(2000);
		
		//step 8: check the checkbox (//div[@class='img'])[2]
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		Thread.sleep(1000);
		//step 9: click on delete button
		driver.findElement(By.xpath("(//div[.='Delete'])[1]")).click();
		Thread.sleep(1000);
		
		//Handle the hidden division pop up
		driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();
		

	}

}
