package com.TestngAllParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class AllParametersDemo {
  @Test(enabled = false)
  public void m1() {
	  System.out.println("M1 Method");
  }
  @Test(invocationCount=2,invocationTimeOut=3000)
  public void m2() {
	  System.out.println("M2 Method");
  }
  @Test(dependsOnMethods = "m5",alwaysRun = true)
  public void m3() {
	  System.out.println("M3 Method");
  }
  @Parameters({"name","rollno"})
  @Test(priority=1,timeOut=2000)
  public void m4(@Optional("optional value")String nm,int rollnum) {
	  System.out.println("M4 Method name :"+nm+" "+"rollnumber:"+rollnum);
  }
  @Test(threadPoolSize=2,invocationCount=2)
  public void m5() {
	  System.out.println("M5 Method");
  }
  @Test(groups="Regression")
  public void m6() {
	  System.out.println("M6 Method");
  }
  
  @Test(groups={"Regerssion","Smoke"})
  public void m7() {
	  System.out.println("M7 Method");
  }
  
  @Test(successPercentage = 50,invocationCount = 3)
  @Parameters("stname")
  public void m8(String name)
  {
  System.out.println("M8 Method name:"+name);
  }
}
