package seleniumadvancedconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicedraganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement From=driver.findElement(By.id("form:drag_content"));
		WebElement To=driver.findElement(By.id("form:drop_header"));
		Actions action=new Actions(driver);
		//METHOD1
		//action.clickAndHold(From).moveToElement(To).release().build().perform();
		//METHOD2
		action.dragAndDrop(From, To).build().perform();
		
		

		
	}

}
