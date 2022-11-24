package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.linkedin.com");
        //enter search term & hit enter
driver.findElement(By.id("session_key")).sendKeys("sindhukavi28@gmail.com"+ Keys.ENTER);

	}
 
}
