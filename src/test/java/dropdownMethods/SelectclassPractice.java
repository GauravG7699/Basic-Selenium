package dropdownMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
				
				//step 2: maximize the window
				driver.manage().window().maximize();
				
				//step 3: navigate to amazon.in
				driver.get("https://demoqa.com/select-menu");
				Thread.sleep(2000);
				
				//step 4: locate a dropdown
				WebElement singleselectDropdown = driver.findElement(By.id("oldSelectMenu"));
				
				//step 5: tohandle the dropdown create object of the class
				Select sel = new Select(singleselectDropdown);
				
				//select option inside the dropdown- using index
				sel.selectByIndex(8);
				System.out.println("index 8 selected");
				Thread.sleep(2000);
				
				//select option inside the dropdown- using value
				sel.selectByValue("7");
				System.out.println("value selected");
				Thread.sleep(2000);
				
				//select option inside the dropdown- using visible text
				sel.selectByVisibleText("Green");
				System.out.println("green text selected");
				
				//check if the dropdown is multiselect or single select dropdown
				boolean status = sel.isMultiple();
				
				if(status==true)
				{
					System.out.println("it is a multiselect dropdown");
				}
				else {
					System.out.println("it is a single select dropdown");
				}
				
				//check all the options inside the checkbox
				List<WebElement> listoptions = sel.getOptions();
				int count=0;
				for(WebElement ele:listoptions)
				{
					System.out.println(ele.getText());
					count++;
				}
				System.out.println(count);

	}

}
