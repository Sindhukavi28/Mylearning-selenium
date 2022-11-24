package seleniumadvancedconcepts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class Practicedownloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement dwnld=driver.findElement(By.id("j_idt93:j_idt95"));
		dwnld.click();
		Thread.sleep(3000);
		
		File filelocation=new File("C:\\Users\\DELL\\Desktop\\Resume\\Updated");
		File[] totalfiles=filelocation.listFiles();
		System.out.println(totalfiles);
		for (File file : totalfiles) {
			if(file.getName().equals("TestLeaf Logo.PNG"))
			{
				System.out.println("file downloaded sucessfully");
				break;
			}
		}
		
		

	}

}
