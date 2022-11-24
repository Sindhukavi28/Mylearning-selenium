package testNGpractice;

import org.testng.annotations.Test;

public class Groupingpractice {

	@Test(groups = {"animal"})
	public void lion()
	{
		System.out.println("lion");
	}
	@Test(groups = {"animal"})
	public void tiger()
	{
		System.out.println("tiger");
	}
	@Test(groups = {"bird"})
	public void peocock()
	{
		System.out.println("peocock");
	}
	@Test(groups = {"bird"})
	public void cuckoo()
	{
		System.out.println("cuckoo");
	}
}
