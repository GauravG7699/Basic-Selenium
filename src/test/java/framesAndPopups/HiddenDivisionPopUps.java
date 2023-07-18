package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
						
				//step 2;- maximise the browser
				 driver.manage().window().maximize();
				 
				 //step 3: wait for 10 sec
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						 
				//navigate to Vtiger 
				 driver.get("https://demo.actitime.com/login.do");
	}

}
