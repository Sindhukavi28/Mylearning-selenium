package seleniumadvancedconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/");
		
		WebElement tooltip =driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[3]/a"));
		String text=tooltip.getAttribute("data-tooltip");
		
		System.out.println(text);
		

	}

}
