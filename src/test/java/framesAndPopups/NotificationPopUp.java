package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser setting
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		//step 1:launch the browser
		WebDriver driver = new ChromeDriver(op);
		//step 2; to maximize the window
		driver.manage().window().maximize();
		//step 3: wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step 4: navigate to app
		driver.get("https://www.yatra.com/");		

	}

}
