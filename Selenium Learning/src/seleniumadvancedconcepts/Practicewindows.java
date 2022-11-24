package seleniumadvancedconcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldwindow=driver.getWindowHandle();
		WebElement openwindow=driver.findElement(By.id("j_idt88:new"));
		openwindow.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String string : allwindows) {
			
			driver.switchTo().window(string);
			
		}
		
		WebElement selectimage=driver.findElement(By.id("j_idt15"));
		
		selectimage.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		
		WebElement multiplewindows=driver.findElement(By.id("j_idt88:j_idt91"));
		multiplewindows.click();
		Set<String> multipleopenedwindows=driver.getWindowHandles();
		int noofwindows=multipleopenedwindows.size();
		
	System.out.println(noofwindows);
	
	for (String windows : multipleopenedwindows) {
		if(!windows.equals(oldwindow))
		{
		driver.switchTo().window(windows);
		driver.close();
	}
	}
	}

}
