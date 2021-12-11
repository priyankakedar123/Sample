package com.TestngAllParameters;

import org.testng.annotations.Test;

public class GrouupDemo {
	@Test(groups="Regression")
	  public void m6() {
		  System.out.println("M6 Method");
	  }
	  
	  @Test(groups={"Regerssion","Smoke"})
	  public void m7() {
		  System.out.println("M7 Method");
	  }
}
