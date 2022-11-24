package seleniumbasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select select= new Select(dropdown1);
		select.selectByIndex(4);
	//Thread.sleep(3000);
		select.selectByValue("4");
	//Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
	//Thread.sleep(3000);
	
		 java.util.List<WebElement> listofoptions =select.getOptions();
		 int size=listofoptions.size();
		 System.out.println(size);
		 
		 dropdown1.sendKeys("Appium");
		 
		WebElement multiselect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select Multiselection=new Select(multiselect);
		
		Multiselection.selectByIndex(1);
		Multiselection.selectByIndex(2);
	
		 




	}

}
