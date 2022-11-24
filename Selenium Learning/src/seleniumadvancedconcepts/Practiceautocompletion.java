package seleniumadvancedconcepts;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Practiceautocompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement input=driver.findElement(By.id("j_idt87:auto-complete_input"));
		input.sendKeys("J");
		Thread.sleep(4000);
		List<WebElement> listofoptions=driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));
		int count=listofoptions.size();
		System.out.println(count);
		for (WebElement webElement : listofoptions) {
			
			if(webElement.getText().equals("JMeter"))
			{
				webElement.click();
				break;
			}
			
		}
		
	}
	
	

}
