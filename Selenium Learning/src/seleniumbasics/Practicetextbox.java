package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
	WebElement entertext=	driver.findElement(By.id("j_idt88:name"));
		entertext.sendKeys("test@gmail.com");
		WebElement appendtext= driver.findElement(By.id("j_idt88:j_idt91"));
		appendtext.sendKeys("to Coimbatore");
		
		WebElement cleartext =driver.findElement(By.id("j_idt88:j_idt95"));
		cleartext.clear();
		
		WebElement gettext =driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
		String value =gettext.getAttribute("value");
		System.out.println(value);
		
		WebElement checkdisabledbox=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean Enabled=checkdisabledbox.isEnabled();
		System.out.println(Enabled);

	}

}
