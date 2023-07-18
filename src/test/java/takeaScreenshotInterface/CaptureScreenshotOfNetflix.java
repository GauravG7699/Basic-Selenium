package takeaScreenshotInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshotOfNetflix {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
       //step1: launch the browser
		WebDriver driver = new ChromeDriver();
		
		//step 2:maximise the browser
		driver.manage().window().maximize();
		
		//step 3: navigate to Netflix
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		
		//take Screenshot of home page
		//step 1: cast the takesscreenshot interface to the driver
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//Step 2: call get scrrenshot as method
		File srcLocation = ts.getScreenshotAs(OutputType.FILE);
		
		//step 3: create folder to store the screenshot
		File dstLocation = new File(".\\Screenshot\\ScreenshotNetflix.png");
		
		//step 4: copy the scrrenshot from src to dst
		Files.copy(srcLocation, dstLocation);
		
		System.out.println("Screenshot taken");
	}

}
