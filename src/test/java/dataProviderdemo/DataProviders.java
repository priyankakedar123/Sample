package dataProviderdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	

	
	
	@DataProvider(name = "Logindata")
  
  public Object[][] loginData()
  {
		Object values[][] = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return values;
		
  }
}
