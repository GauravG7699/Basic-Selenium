package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderPractice {
   
	@Test(dataProvider = "getData")
	public void dataProviderDemo(String name,int price)
	{
		System.out.println("phone is-->"+name+" and price is-->"+price);
		
	}
	@DataProvider
	public Object[][] getData()//also works base on rows and column
	{
		Object [][] data=new Object[3][2];//row-column
		data [0][0] ="iphone";//first data set
		data [0][1] =25000;
		
		data [1][0] ="samsung";//second data set
		data [1][1] =20000;
		
		data [2][0] ="vivo";//third data set
		data [2][1] =10000;
		
		return data;
		
	}
}
