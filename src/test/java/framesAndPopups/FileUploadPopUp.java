package framesAndPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//step 1: launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		//step 2: maximize the window
		 driver.manage().window().maximize();
		 
		//step 3:wait for 10 sec
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //step 4: navigate to url
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		 Thread.sleep(1000);
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy(0,200)", "");
		 driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		 Thread.sleep(2000);
		 
		 

	}

}
