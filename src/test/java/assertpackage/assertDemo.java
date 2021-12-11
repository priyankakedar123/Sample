package assertpackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertDemo
{
 
	
	@Test  
public void Hardassetrt() {
		String expected = "temple";
		String actual = "temple";
		Assert.assertEquals(actual, expected);
		System.out.println("welcome to temple hard assert");
		
  }
	@Test
	public void softassertfun()
	{
		String expected = "pune";
		String actual = "mumbai";
		String expect1 = "mumbai";
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(actual, expected);
		System.out.println("welcome to temple");
		asrt.assertEquals(actual, expect1);
		System.out.println("welcome to mumbai");
		asrt.assertAll();
		
		
	}
}
