package takeaScreenshotInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
				//step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
				
				//step 2;- maximise the browser
				 driver.manage().window().maximize();
				 
				//navigate to Vtiger 
				 driver.get("http://localhost:8888/");
				 Thread.sleep(2000);
				 
				//identify the element
				 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
				 driver.findElement(By.id("submitButton")).click();
				 
				 System.out.println("Home page displayed");
				 
				 //take screenshot of home page
				 //step 1; cast the takesscreenshot interface to the driver
				 TakesScreenshot ts=(TakesScreenshot) driver;
				 
				 
				 //step 2 :call get screenshot as method
				 File srcLocation = ts.getScreenshotAs(OutputType.FILE);
				 
				 //step 3: create a folder to store the screenshot
				 File dstLocation = new File(".\\Screenshot\\ScreenShot1.png");
				 
				 //step 4: copy the screenshot from src to dst
				 Files.copy(srcLocation, dstLocation);
				 
				 System.out.println("Screenshot taken");
				 
				 
				 
				  
				 

	}

}
