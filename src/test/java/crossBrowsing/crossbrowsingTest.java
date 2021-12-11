package crossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsingTest extends CrossbrowsingUtil {
	
	@Test
	public void search()
	{
		
    	
    	
    driver.get("https://www.google.com/");
   WebElement ele	= driver.findElement(By.cssSelector("input[name='q']"));
   ele.sendKeys("testing");
	ele.sendKeys(Keys.ENTER);
   //driver.findElement(By.cssSelector("input.gNO89b:nth-child(1)")).click();
	
	
		
	}
	
	
}
