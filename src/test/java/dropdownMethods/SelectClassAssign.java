package dropdownMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAssign {

	public static void main(String[] args) throws InterruptedException {
	
		//step 1; navigate to vtiger application
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	    driver.findElement(By.id("submitButton")).click();
	    Thread.sleep(2000);
	    //step 2: Navigate to organization link
	    driver.findElement(By.xpath("//a[.='Organizations']")).click();
	    //step 3: click on create organization
	    driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	    //step 4: create organization with mandatory information
	    driver.findElement(By.name("accountname")).sendKeys("Bajaj Electricals Ltd");
	    driver.findElement(By.name("website")).sendKeys("http://bajajelectricals.com/");
	    driver.findElement(By.name("tickersymbol")).sendKeys("BAJAJELEC.NS");
	    driver.findElement(By.name("employees")).sendKeys("105");
	    driver.findElement(By.name("email2")).sendKeys("gaurav1@gmail.com");
	    //step 5: choose electronics in the industry dropdown
	    WebElement singleSelectDropdown = driver.findElement(By.name("industry"));
	    Select sel = new Select(singleSelectDropdown);
	    sel.selectByValue("Electronics");
	    //step 6: choose investor in type dropdown
	    WebElement dropdown = driver.findElement(By.name("accounttype"));
	    Select sel2 = new Select(dropdown);
        sel2.selectByValue("Investor");
        // step 7: Save organization information
        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	}

}
