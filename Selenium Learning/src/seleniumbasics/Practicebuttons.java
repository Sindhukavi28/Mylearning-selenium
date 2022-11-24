package seleniumbasics;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicebuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		WebElement position=driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint= position.getLocation();
		int X=xypoint.getX();
		int Y=xypoint.getY();
		System.out.println("X value is "+ X +" Y value is " + Y);
		WebElement colour=driver.findElement(By.id("j_idt88:j_idt96"));

		String getcolour=colour.getCssValue("background-color");

		System.out.println(getcolour);
		WebElement sizebutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']/span[2]"));
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();
		System.out.println("Height is"+ height +"width is"+width);

		WebElement clickbutton=driver.findElement(By.id("j_idt88:j_idt90"));

		clickbutton.click();

	}

}
