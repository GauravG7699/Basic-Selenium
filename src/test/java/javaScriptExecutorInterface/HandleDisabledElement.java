package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	           //step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
				
				//step 2;- maximise the browser
				 driver.manage().window().maximize();
				 
				//navigate to selenium dev
				 driver.get("https://demoapp.skillrary.com/");
				 Thread.sleep(2000);
				 
				//identify the disabled element
				WebElement disabledtextfield = driver.findElement(By.xpath("//input[@class='form-control']"));
				
				//enter data into disabled textfield
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				Thread.sleep(1000);
				
				js.executeScript("arguments[0].value='qspiders'", disabledtextfield);
				//js.executeScript("arguments[0].click()", disabledtextfield);// for click

	}

}
