package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class^='inputtext _55r1 inputtext _1']")).sendKeys("Alpha123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class$=' inputtext _9npi']")).sendKeys("Charli");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id^='login']")).click();
	}

}
