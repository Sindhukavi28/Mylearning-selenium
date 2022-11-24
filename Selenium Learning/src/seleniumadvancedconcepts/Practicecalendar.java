package seleniumadvancedconcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practicecalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
		next.click();
		WebElement next1=driver.findElement(By.xpath("//a[@title='Next']"));
		next1.click();
		
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		
	
	}
	

}
