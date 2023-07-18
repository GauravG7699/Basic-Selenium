package testNg;

import org.testng.annotations.Test;

public class TestNgPractice {
	//To change the execution order @test inside the test class= @Test (priority = int)
@Test(priority = 0)
public void createCustomer()
{
	System.out.println("customer is created");
	
}
@Test (priority = 2 )
public void deleteCustomer()
{
	System.out.println("customer is deleted");
}
@Test(priority = 1)
public void modifyCustomer()
{
	System.out.println("customer is modify");
}
   //To run the same test script more than once= @Test (invocationCount = int)
@Test(invocationCount =  2)
public void createCustomer1()
{
	System.out.println("customer is created......");
	
}
   // to disable a @test from current execution= @Test (enabled= false)
@Test (enabled = false )
public void deleteCustomer1()
{
	System.out.println("customer is disable");
}

}
