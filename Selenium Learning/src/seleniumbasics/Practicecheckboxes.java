package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicecheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		WebElement selectjava=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]"));
		selectjava.click();
		WebElement confirmselection=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input"));
		boolean check=confirmselection.isSelected();
		System.out.println(check);
		WebElement deselect1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[1]"));
		if(deselect1.isSelected())
		{
			deselect1.click();
		}
		
		WebElement deselect2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[2]"));
				if(deselect2.isSelected())
				{
					deselect2.click();
				}
				
	}

}
