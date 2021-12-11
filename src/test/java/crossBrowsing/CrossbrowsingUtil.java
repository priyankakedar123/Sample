package crossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossbrowsingUtil {
	static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	//@Parameters("browser")
public  void setup(String browser)
{
	if(browser.equalsIgnoreCase("Chrome"))
	{
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else
	if(browser.equalsIgnoreCase("IE"))
	{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		
	}
	else
	if(browser.equalsIgnoreCase("FireFox"))
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else
		if(browser.equalsIgnoreCase("Edge"))
		{
			
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		}
		
}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
