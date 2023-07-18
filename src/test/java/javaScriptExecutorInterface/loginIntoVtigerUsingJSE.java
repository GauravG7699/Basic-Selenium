package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginIntoVtigerUsingJSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2;- maximise the browser
		 driver.manage().window().maximize();
		 
		//navigate to Vtiger 
		 driver.get("http://localhost:8888/");
		 Thread.sleep(2000);
		 
		//identify the element
		 WebElement username = driver.findElement(By.xpath("//input[@name='user_name']"));
		 WebElement passward = driver.findElement(By.xpath("//input[@name='user_password']"));
		 WebElement login = driver.findElement(By.id("submitButton"));
		 
		//enter data into  textfield
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].value='admin'", username);
		 js.executeScript("arguments[0].value='admin'", passward);
		 js.executeScript("arguments[0].click()", login);
		 
		 //get the title of the page
		 
		String title = js.executeScript("return document.title", "").toString();
		System.out.println(title);;
		 
	}

}
