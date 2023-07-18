package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.netflix.com/in/Login");
		 Thread.sleep(2000);
		 driver.findElement(By.id("id_userLoginId")).sendKeys("Spartan@07gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("id_password")).sendKeys("Alpha");
		 
	     driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
	}

}
