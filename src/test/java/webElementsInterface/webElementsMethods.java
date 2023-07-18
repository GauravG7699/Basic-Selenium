package webElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      //step 1: launch the browser
		WebDriver driver = new ChromeDriver();
		
		//step 2: maximize the window
		driver.manage().window().maximize();
		
		//step 3: load the url-demo actitime app
		driver.get("https://demo.actitime.com/login.do");
		
		//web element method- sendkeys()- enter the data into textfield
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		//web element method- clear()- remove the data from the textfield
		driver.findElement(By.className("textField")).clear();
		 
		//web element method- click()- to perform click operation
		driver.findElement(By.className("textField")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		//WebElement method - getAttribute(String attributeName) - get the attribute
		// value
		String attribute = driver.findElement(By.id("loginButton")).getAttribute("href");
		System.out.println("attribute value is " + attribute);
		
		//WebElement method getTagName()- get tagname of web element
		//String tag = driver.findElement(By.id("loginbutton")).getTagName();
		//System.out.println("TagName of web element is " + tag);
		
		//// WebElement method - getText() - get the visible text of web element
		String text = driver.findElement(By.id("loginButton")).getText();
		System.out.println("visible text on web element is " + text);
		
		// WebElement method - getLocation() - position of the web element
		Point position = driver.findElement(By.id("loginButton")).getLocation();
		int posX = position.getX();
		System.out.println("xth position is " + posX);
		int posY = position.getY();
		System.out.println("yth position is " + posY);
		
		// WebElement Method - getSize() - Dimensions of the web element
		org.openqa.selenium.Dimension size = driver.findElement(By.id("loginButton")).getSize();
		int height = (int) size.getHeight();
		System.out.println("element height is " + height);
		int width = size.getWidth();
		System.out.println("element width is " + width);
		
		// WebElement Method - getRect() - Position and Dimension of the web element
	    Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
		int x = rect.getX();
		System.out.println("x using rectange " + x);
		int y = rect.getY();
		System.out.println("y using rectange " + y);
		int h = rect.getHeight();
		System.out.println("height using rectange " + h);
		int w = rect.getWidth();
		System.out.println("width using rectange " + w);
				
				
		// WebElement Method - getCSSValue() - To get the CSS value for Css properties
		String cssValue = driver.findElement(By.id("loginButton")).getCssValue("display");
		System.out.println("CSS Value is " + cssValue);

		// WebElement Method - getAriaRole() - To get the element design type
		String role = driver.findElement(By.id("loginButton")).getAriaRole();
		System.out.println("aria role is " + role);
		String roleUserName = driver.findElement(By.className("textField")).getAriaRole();
		System.out.println("aria role is " + roleUserName);
		
		//WebElement Method - getAccessibleName() - To get the element accessiblity Name
		String accessibleName = driver.findElement(By.className("textField")).getAccessibleName();
		System.out.println("AccessibleName is "+accessibleName);
		String accessibleNameBtn = driver.findElement(By.id("loginButton")).getAccessibleName();
		System.out.println("Accessible Name is "+accessibleNameBtn);
			
		driver.get("http://localhost:8888");
		String name = driver.findElement(By.name("user_name")).getAccessibleName();
		System.out.println("name is "+name);
		
		//WebElement Method - isDisplayed() - To check if the element is displayed/present in the current DOM
				boolean elementDispled = driver.findElement(By.name("user_name")).isDisplayed();
				if(elementDispled==true)
				{
					driver.findElement(By.name("user_name")).sendKeys("admin");
					System.out.println("element displayed");
				}
				else
				{
					System.out.println("element not present");
				}
				
	}

}
