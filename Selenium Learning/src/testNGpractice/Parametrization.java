package testNGpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Test
	@Parameters("Input")
	public void getdynamicinput(String giveninput)
	{
		
		System.out.println("Dynamic input from xml "+giveninput);
	}

}
