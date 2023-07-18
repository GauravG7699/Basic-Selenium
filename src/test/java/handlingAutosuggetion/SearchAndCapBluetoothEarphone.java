package handlingAutosuggetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCapBluetoothEarphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
				
				//step 2: maximize the window
				driver.manage().window().maximize();
				
				//step 3: navigate to amazon.in
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				
				//step 4: search for Bluetooth earphones and click
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth Earphones");
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				
				//step 5: search bluetooth earphone of boalt brand
				driver.findElement(By.xpath("//label[text()='boAt']")).click();
				
				
				

	}

}
