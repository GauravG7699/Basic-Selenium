package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//load the url
		driver.get("http://localhost:8888/");
		//
		WebElement un = driver.findElement(By.name("user_name"));
		WebElement submit = driver.findElement(By.id("submitbutton"));
		//sendkeys and click
		Actions act = new Actions (driver);
		act.sendKeys(un,"admin",Keys.TAB,"admin").perform();
		act.click(submit).perform();

	}

}
