package seleniumadvancedconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		String text=button1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("Click"));
		button2.click();
		String text1=button2.getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int count=totalframes.size();
		System.out.println(count);
		
		



	}

}
