package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilTheElementRef {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2;- maximise the browser
		 driver.manage().window().maximize();
		 
		//navigate to selenium dev
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(2000);
		 
		 WebElement clickon = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		 WebElement scrolluntil = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		 
		 Thread.sleep(1000);
		 
		 //scroll until the element ref
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 
		 js.executeScript("arguments[0].scrollIntoView();", scrolluntil);
		 Thread.sleep(1000);
		 clickon.click();
	}

}
