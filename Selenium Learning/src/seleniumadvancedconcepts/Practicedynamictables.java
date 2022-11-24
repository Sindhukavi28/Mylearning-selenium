package seleniumadvancedconcepts;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
public class Practicedynamictables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		List<WebElement> coloumns=driver.findElements(By.tagName("th"));
		int ccount=coloumns.size();
		System.out.println("no of coloumns "+ ccount);
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rcount=rows.size();
		System.out.println("no of rows "+rcount);
		
	WebElement	percent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String percentage=percent.getText();
		System.out.println(percentage);
		List<WebElement> listofvalues=driver.findElements(By.xpath("//td[2]"));
		List<Integer> numericvaluelist= new ArrayList<Integer>();
		for (WebElement valueslist : listofvalues) {
			String individualvalue=valueslist.getText().replace("%","");
			numericvaluelist.add(Integer.parseInt(individualvalue));
			
		}
		System.out.println("list is"+numericvaluelist);
		int smallest=Collections.min(numericvaluelist);
		System.out.println("smallest number is "+ smallest);
		String smallvaluestring=Integer.toString(smallest)+"%";
		String finalXpath="//td[normalize-space()="+"\""+ smallvaluestring +"\""+"]"+"//following::td[1]";
				System.out.println(finalXpath);
		WebElement finalvalue=driver.findElement(By.xpath(finalXpath));
		finalvalue.click();
		
		
		
}
	

}
