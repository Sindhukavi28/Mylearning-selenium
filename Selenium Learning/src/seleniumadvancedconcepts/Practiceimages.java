package seleniumadvancedconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		WebElement image2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if(image2.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image broken");
		}
		else
		{
			System.out.println("Image NOT broken");
		}
		

	}

}
