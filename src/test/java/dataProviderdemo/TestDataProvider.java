package dataProviderdemo;

import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider = "Logindata", dataProviderClass = DataProviders.class)
	public void m1(String uname,String password)
	{
		System.out.println(uname+"\t"+password);
	}
	
	
	  
}
