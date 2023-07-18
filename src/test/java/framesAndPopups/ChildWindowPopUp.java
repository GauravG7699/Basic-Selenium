package framesAndPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Step 1: to launch the browser
		WebDriver driver = new ChromeDriver();
		//step 2; to maximize the window
		driver.manage().window().maximize();
		//step 3: wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step 4: navigate to app
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String mainId = driver.getWindowHandle();
		System.out.println("main window id is"+mainId);
		
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		Set<String> window = driver.getWindowHandles();
		for(String win:window)
		{
			if(!win.equals(mainId))
			{
				System.out.println("this is a child id"+win);
				break;
			}
			
		}
		

	}

}
