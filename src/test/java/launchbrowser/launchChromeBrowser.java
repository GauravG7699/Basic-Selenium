package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("http://laptop-bfu477ep/login.do");
	}

}
