package seleniumadvancedconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testleaf.herokuapp.com/pages/Link.html");

		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();



		WebElement whereiam=driver.findElement(By.partialLinkText("Find where"));
		String url=whereiam.getAttribute("href");
		System.out.println(url);


		WebElement verify=driver.findElement(By.linkText("Verify am I broken?"));
		verify.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Link is broken");
		}
		driver.navigate().back();

		WebElement homepage2=driver.findElement(By.linkText("Go to Home Page"));
		homepage2.click();
		driver.navigate().back();

		List<WebElement> count=driver.findElements(By.tagName("a"));
		int linkcount=count.size();
		System.out.println("link count is " +linkcount);


	}

}
