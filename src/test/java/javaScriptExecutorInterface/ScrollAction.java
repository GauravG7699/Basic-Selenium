package javaScriptExecutorInterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        //step 1:- launch the browser
				WebDriver driver=new ChromeDriver();
				
				//step 2;- maximise the browser
				 driver.manage().window().maximize();
				 
				 //navigate to selenium dev
				 driver.get("https://www.selenium.dev/downloads/");
				 Thread.sleep(2000);
				 
				 //scroll actions
				 JavascriptExecutor js= (JavascriptExecutor) driver;
				 Thread.sleep(2000);
				 
				 //scroll down
				 js.executeScript("window.scrollBy(0,1000);", "");
				 Thread.sleep(2000);
				 
				 //scroll up
				 js.executeScript("window.scrollBy(0,-1000)", "");
				 Thread.sleep(2000);
				 
				 //scroll right
				 js.executeScript("window.scrollBy(200,0)", "");
				 Thread.sleep(2000);
				 
				 //scroll left 
				 js.executeScript("window.scrollBy(-200,0)", "");
				 Thread.sleep(2000);
				 
				 //scroll down until the bottom of the page
				 js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
				 Thread.sleep(2000);
				 
				 //scroll up until the bottom of the page
				 js.executeScript("window.scrollTo(0,-document.body.scrollHeight);", "");
				 

	}

}
