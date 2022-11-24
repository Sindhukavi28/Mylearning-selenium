package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceradiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		WebElement rd1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input[1]"));
		boolean check1=rd1.isSelected();
		System.out.println(check1);
		WebElement rd2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input[2]"));
		boolean check2=rd2.isSelected();
		System.out.println(check2);
		
		WebElement selectrd=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
		selectrd.click();
		
	}

}
