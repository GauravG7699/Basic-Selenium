package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethodOfWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("pranav gangurde",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='S8ee5 CwbYXd wHYlTd']")).click();
		driver.findElement(By.xpath("//img[@alt='Pranav Gangurde - Executive - Utility & Facility - Daramic, LLC | LinkedIn']")).click();
		

	}

}
