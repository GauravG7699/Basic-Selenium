package dropdownMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2: maximize the window
		driver.manage().window().maximize();
		
		//step 3: navigate to amazon.in
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		//identyfy the web element
		WebElement multiSelectDropdown = driver.findElement(By.id("cars"));
		
		//check it is multiselect dropdown
		Select sel = new Select(multiSelectDropdown);
		boolean value = sel.isMultiple();
		if(value==true)
		{
			System.out.println("it is multiselect dropdown");
			
		}
		else {
			System.out.println("it is singleselect dropdown");
		}
		
		//select audi and saab value from dropdown
		sel.selectByValue("audi");
		System.out.println("audi is selected");
		Thread.sleep(2000);
		
		sel.selectByValue("saab");
		System.out.println("saab is selected");
		Thread.sleep(2000);
		
		//deselect audi from the selectes options
		sel.deselectByValue("audi");
		System.out.println("audi is deselected");
		Thread.sleep(2000);
		
		//deselect all options
	     //sel.deselectAll();
	    // System.out.println("all the options get deselected");
	     
	    //get all selected options
		List<WebElement> allselected = sel.getAllSelectedOptions();
		for(WebElement ele:allselected)
		{
			System.out.println(ele.getText());
		}
		
		// get first select option
		WebElement firstoption = sel.getFirstSelectedOption();
		System.out.println("first selected option"+firstoption);
	
		
		//get all wrapped options
		WebElement allwrappedEle = sel.getWrappedElement();
		System.out.println(allwrappedEle.getText());
		Thread.sleep(2000);
		
		

	}

}
