package testNGpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Suitecreation {
	WebDriver driver;
	long endtime;
	long starttime;
	@BeforeSuite
	public void openbrowser()
	{
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe")	;
		driver= new ChromeDriver();
	}
	@Test
	public void opengooglelinkedin()
	{
	
	 driver.get("https://www.linkedin.com");
	}
	@Test
	public void openbing()
	{
		
		 driver.get("https://www.bing.com");
	}
	@AfterSuite
	public void closebrowser()
	{
	driver.quit();	
	endtime=System.currentTimeMillis();
	long Totaltime=starttime-endtime;
	System.out.println("Execution time is"+Totaltime);
	
	}
}
