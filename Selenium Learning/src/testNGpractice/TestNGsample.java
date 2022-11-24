package testNGpractice;

import org.testng.annotations.Test;

public class TestNGsample {
	@Test(priority = 1)
	public void firstcase() {
		System.out.println("First case");
	}
	@Test(priority = 2)
	public void secondcase() {
		System.out.println("Second case");
	}
	@Test(priority = 0)
	public void thirdcase() {
		System.out.println("Third case");
	}



}
