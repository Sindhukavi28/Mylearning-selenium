package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement normalalert= driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']/span[2]"));
		normalalert.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmalert= driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/span[2]"));
		confirmalert.click();
		Alert alert1= driver.switchTo().alert();
		alert1.dismiss();
		
		
		WebElement promptalert= driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']/span[2]"));
		promptalert.click();
		Alert alert2= driver.switchTo().alert();
		alert2.sendKeys("sindhu");
		alert2.accept();
		

	}

}
